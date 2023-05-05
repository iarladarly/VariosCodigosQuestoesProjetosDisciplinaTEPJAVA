/*
 Questão 03: Uma fábrica de refrigerante chamada Ibiapaba S/A vende seus produtos em três formatos: lata com 350 ml, garrafa com
600 ml e garrafa PET de 2 litros. Os comerciantes compram sempre uma determinada quantidade de cada formato a um preço x por litro.
Nesse contexto faça um algoritmo para calcular quantos litros de refrigerante cada um dos 15 comerciantes compram e quanto cada um 
deles pagará. Obs1. Usar o laço de repetição do{...}while(...). Obs2. Validar os dados. 

 */
package questao03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {

        try {
            int i = 1;
            do {

                JOptionPane.showMessageDialog(null, "\t\t\t\t\t\t\t\t\t---------------------------------\t\t\t\t\t "
                        + "         Fábrica de refrigerante Ibiapaba S/A         \t\t\t\t\t\t\t\t\t-----------------------------------------------"
                        + "\n\nA seguir informe a quantidade de cada tipo de refrigerante que deseja, o valor a ser pago será por litro! ");
                JOptionPane.showMessageDialog(null, "Compras do comerciante " + i);

                //Leitura da quantidade desejada de refrigerantes
                int Quantidade_lata350ml, Quantidade_garrafa600ml, Quantidade_garrafa_PET2_litros;

                //Condição para aceitar somente valores de crédito
                Quantidade_lata350ml = Integer.parseInt(JOptionPane.showInputDialog(" Insira a quantidade desejada de lata de 350 ml:"));

                while (Quantidade_lata350ml <= 0) {
                    Quantidade_lata350ml = Integer.parseInt(JOptionPane.showInputDialog("Valor anterior inválido, a quantidade desejada de "
                            + "lata de 350 ml:"));
                }

                Quantidade_garrafa600ml = Integer.parseInt(JOptionPane.showInputDialog(" Insira a quantidade desejada de lata de 600 ml:"));

                while (Quantidade_garrafa600ml <= 0) {
                    Quantidade_garrafa600ml = Integer.parseInt(JOptionPane.showInputDialog("Valor anterior inválido, insira a quantidade desejada"
                            + " de lata de 600 ml:"));
                }

                Quantidade_garrafa_PET2_litros = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada de garrafa PET2 de"
                        + " litros:"));

                while (Quantidade_garrafa_PET2_litros <= 0) {
                    Quantidade_garrafa_PET2_litros = Integer.parseInt(JOptionPane.showInputDialog("Valor anterior inválido, insira a quantidade"
                            + " desejada de garrafa PET2 de litros:"));
                }

                //Leitura de valor a ser pago por litro
                int valor;
                valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser pago por litro: "));
                while (valor <= 0) {
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Valor anterior inválido, insira o valor a ser pago por litro: "));
                }

                //Calcuçlo da quantidade de mililitros (ml) de refrigerante para livros quando divide por 1000
                int calculo_total_litros = ((350 * Quantidade_lata350ml + 600 * Quantidade_garrafa600ml
                        + 2000 * Quantidade_garrafa_PET2_litros) / 1000);
                //Valor R$ * litro
                double calculo_final = (calculo_total_litros * valor);

                //Formatação de duas casas decimais do valor da saída 
                DecimalFormat df = new DecimalFormat("0.00");

                //SAÍDA DE DADOS
                JOptionPane.showMessageDialog(null, "\t\t\t\t\t-----------------------------------------------  \t\t\t\t\t\t\t         Comerciante "
                        + i + "        -------------------------------------------------\n\n" + "\tO total de litros de refrigerantes combrados "
                        + "foram " + calculo_total_litros + ". O valor total a ser pago é de R$ " + df.format(calculo_final));

                i++;
            } while (i <= 15);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Valor inválido! ", "ERRO !", JOptionPane.ERROR_MESSAGE);
        }
    }
}
