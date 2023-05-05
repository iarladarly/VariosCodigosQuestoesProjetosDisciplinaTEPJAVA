package frutas;

import javax.swing.JOptionPane;

public class Frutas {
    //#2. Construa uma matriz 3X3 e preencha com nomes de frutas ou legumes e em seguida exiba-as. 

    public static void main(String[] args) {

        try {
            String frutas[][] = {
                {"Maçã", "Uva", "Goiaba"},
                {"Banana", "Laranja", "Manga"},
                {"Tangerina", "Pera", "Melancia"}};

            JOptionPane.showMessageDialog(null, "Lista de frutas.");
            for (int i = 0; i < frutas.length; i++) {
                for (int j = 0; j < frutas.length; j++) {
                    JOptionPane.showMessageDialog(null, frutas[i][j], "Fruta", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
