package animais;

import javax.swing.JOptionPane;

public class Animais {

    //#1. Construa um vetor que receba os nomes de 20 animais em seguida exiba-os.
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "A seguir informe o nome de 20 animais!");

            String animais[] = new String[20];

            for (int i = 0; i < 20; i++) {

                animais[i] = String.format(JOptionPane.showInputDialog("Informe o nome de um animal: "));
                

            }
            JOptionPane.showMessageDialog(null, "A segui vai mostrar os nomes dos animais inseridos.");
        for (int j = 0; j < 20; j++) {
                JOptionPane.showMessageDialog(null, animais[j], "Animal " + (j + 1), JOptionPane.INFORMATION_MESSAGE);

            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
       
    }
}