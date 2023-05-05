/*
 #3. Construa um algoritmo para verificar se um valor lido é par ou ímpar.
 Obs. Utilizar operador ternário. *
 */
package questao03;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));

            JOptionPane.showMessageDialog(null, (numero % 2 == 1) ? numero + " é um número impar" : numero + " é um número par", " ", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor invalido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
