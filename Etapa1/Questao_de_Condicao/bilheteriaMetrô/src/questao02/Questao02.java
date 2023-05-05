/*
2. Faça um algoritmo para ajudar a bilheteria do metrô. O operador deve informar o tipo do bilhete
(unitário, duplo ou 10 viagens) e o valor pago pelo passageiro. O sistema deve mostrar, a quantidade de
bilhetes possíveis e o troco que o passageiro deve receber.Considere a seguinte tabela de preço: Bilhete
unitário----1,30; Bilhete duplo-----2,60; Bilhete de 10 viagens-----12,00. 
Obs1. Não aceitar valores negativos ou nulos. *
 */
package questao02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {

        try {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Faça a escolha do tipo de bilhete que o passageiro "
                    + "deseja adquirir\n 1 - Bilhete Unitário: R$ 1,30\n 2 - Bilhete Duplo: R$ 2,60\n"
                    + " 3 - Bilhete de 10 viagens: R$ 12,00"));
            
            double valor_bilhete=0;
            double valor_pago;
            String tipo_bilhete = null;

            if (opcao < 1 || opcao > 3) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida","", JOptionPane.ERROR_MESSAGE);
            } else {
                switch (opcao) {
                    case 1:
                        valor_bilhete = 1.30;
                        tipo_bilhete = "1 - Bilhete Unitário";
                        break;
                    case 2:
                        valor_bilhete = 2.60;
                        tipo_bilhete = "2 - Bilhete Duplo";
                        break;
                    case 3:
                        valor_bilhete = 12.00;
                        tipo_bilhete = "3 - Bilhete de 10 viagens";
                        break;
                }

                valor_pago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor pago pelo passageiro"));

                if (valor_pago <= 0) {
                    JOptionPane.showMessageDialog(null, "Você deve informar um valor maior que zero.", "Valor Inválido"
                            , JOptionPane.ERROR_MESSAGE);
                }else {
                    if (valor_pago / valor_bilhete < 1) {
                        JOptionPane.showMessageDialog(null, "O valor pago é insuficiente para adquirir este bilhete", 
                                "Valor Insuficiente", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int possiveisBilhetes = (int) (valor_pago / valor_bilhete);
                        int quantidadeBilhete = Integer.parseInt(JOptionPane.showInputDialog("O passageiro pode adquirir até "
                                + possiveisBilhetes + " bilhete(s) do tipo " + tipo_bilhete + "\nQuantos bilhetes este deseja adquirir?"));

                        if(quantidadeBilhete > possiveisBilhetes) {
                            JOptionPane.showMessageDialog(null, "O valor pago pelo cliente não é suficiente para comprar essa quantidade de"
                                    + " bilhetes.", "Quantidade Inválida", JOptionPane.ERROR_MESSAGE);
                        }else{
                            double troco = valor_pago - (quantidadeBilhete * valor_bilhete);

                            JOptionPane.showMessageDialog(null, "-------------Compra efetuada-------------\n\nTipo do Bilhete: "
                                    + tipo_bilhete + "\n" + "Valor: R$ " 
                                    +new DecimalFormat("#,##0.00").format(valor_bilhete) + "\n" + "Quantidade: "
                                    +quantidadeBilhete + "\n" + "Total: R$ " +new DecimalFormat("#,##0.00").format((quantidadeBilhete * valor_bilhete))
                                    +"\n" + "Troco: R$ " + new DecimalFormat("#,##0.00").format(troco)+ "\\n---------------------------------------------------");
                        }

                    }
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
