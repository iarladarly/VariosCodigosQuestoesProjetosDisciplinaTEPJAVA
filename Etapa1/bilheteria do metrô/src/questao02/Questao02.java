/*
Questão 02: Faça um algoritmo para ajudar a bilheteria do metrô. O operador deve informar o tipo do bilhete
(unitário, duplo ou 10 viagens) e o valor pago pelo passageiro. O sistema deve mostrar, a quantidade de
bilhetes possíveis e o troco que o passageiro deve receber.Considere a seguinte tabela de preço: Bilhete
unitário----1,30; Bilhete duplo-----2,60; Bilhete de 10 viagens-----12,00. 
Obs1. Não aceitar valores negativos ou nulos. *

IFCE - Instituto Federal do Ceará - Campus Tianguá-CE
Nome: Alex Wesley, Jordan Ferreira, Iarla Darly, Andressa Silva
4º Semestre (Bacharelado em Ciência da Computação) - 2021.2

 */
package questao02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {

        try {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Quais dos tipos de bilhetes que você "
                    + "deseja adquirir?\n(Digite o número da opção)\n"
                    + "\nOpção 1 : Bilhete Unitário---------------------------------R$ 1,30"
                    + "\nOpção 2 : Bilhete Duplo------------------------------------R$ 2,60\n"
                    + "Opção 3 : Bilhete de 10 viagens------------------------R$ 12,00"));
            
            double valor_bilhetes=0, valor;
            String tipo_bilhete = null;

            if (opcao < 1 || opcao > 3) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida","", JOptionPane.ERROR_MESSAGE);
            } else {
                switch (opcao) {
                    case 1:
                        valor_bilhetes = 1.30;
                        tipo_bilhete = "bilhete unitáro";
                        break;
                    case 2:
                        valor_bilhetes = 2.60;
                        tipo_bilhete = "bilhete duplo";
                        break;
                    case 3:
                        valor_bilhetes = 12.00;
                        tipo_bilhete = "biblete de 10 viagens";
                        break;
                }

                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago pelo passageiro:"));

                if (valor <= 1.20) {
                    JOptionPane.showMessageDialog(null, "Você deve informar valores maiores ou igual a R$ 1.30.", "Valor Inválido."
                            , JOptionPane.ERROR_MESSAGE);
                }else {
                    if (valor/ valor_bilhetes < 1) {
                        JOptionPane.showMessageDialog(null, "O valor pago é insuficiente para adquirir este bilhete.", 
                                "Valor Insuficiente", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int adquirir_bilhetes = (int) (valor/ valor_bilhetes);
                        int quantidade_bilhete = Integer.parseInt(JOptionPane.showInputDialog("O passageiro pode adquirir até "
                                + adquirir_bilhetes + " " + tipo_bilhete + "\nquantos bilhetes deseja adquirir?"));

                        if(quantidade_bilhete > adquirir_bilhetes) {
                            JOptionPane.showMessageDialog(null, "O valor pago pelo cliente não é suficiente para comprar essa quantidade de"
                                    + " bilhetes.", "Quantidade Inválida", JOptionPane.ERROR_MESSAGE);
                        }else{
                            double troco = valor - (quantidade_bilhete * valor_bilhetes);

                            JOptionPane.showMessageDialog(null,"Compra de "+tipo_bilhete + "\nValor: R$ " 
                                    +new DecimalFormat("0.00").format(valor_bilhetes) + "\n" + "Quantidade: "
                                    +quantidade_bilhete + "\n" + "Total: R$ " + new DecimalFormat("0.00").format((quantidade_bilhete * valor_bilhetes))
                                    +"\n" + "Troco: R$ " + new DecimalFormat("0.00").format(troco));
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

