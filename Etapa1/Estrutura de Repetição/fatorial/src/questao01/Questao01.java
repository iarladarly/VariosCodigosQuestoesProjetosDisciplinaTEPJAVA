/*#1. Faça um algoritmo que receba um número nulo ou positivo e retorne o seu fatorial.
Lembrando que o fatorial de 0! = 1 e de 1!= 1.*/

package questao01;
import javax.swing.JOptionPane;

public class Questao01{
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("insira um número: "));
            int fatorial = 0;

            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Valor invalido, somente é aceito"
                        + " numeros que sejam nulos ou positivos!");
            } else if (numero == 1 || numero == 0) {
                JOptionPane.showMessageDialog(null, "Resultado do fatorial 1");
            } else {
                for (fatorial = 1; numero > 1; numero = numero - 1) {
                    fatorial = numero * fatorial;
                }
                JOptionPane.showMessageDialog(null, "Resultado do numero fatorial é: " + fatorial);
            }  
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}