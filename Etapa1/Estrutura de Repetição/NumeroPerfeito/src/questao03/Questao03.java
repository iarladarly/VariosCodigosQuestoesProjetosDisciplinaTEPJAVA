/*
#3. Escreva um algoritmo que leia um número e diga se este número é perfeito ou não. Um número perfeito
é aquele que é igual à soma de seus divisores, menos ele. Ex: 6 =1+2+3, 28=1+2+4+7, etc..
*/
package questao03;
import javax.swing.JOptionPane;

public class Questao03{

    public static void main(String[] args){

        try {

            int soma = 0;
            int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um número: "));
            for (int i = 1; i < numero; i++) {

                if (numero % i == 0) {
                    soma = soma + i;
                }
            }
            if (soma == numero) {
                JOptionPane.showMessageDialog(null, "O número " + numero + "  é perfeito!");
            } else {
                JOptionPane.showMessageDialog(null, "O número inserido não é perfeito.");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
