package fatorial;

import javax.swing.JOptionPane;

class Fatorial {

    int fatoriall(int numero) {

        if (numero == 1 || numero==0) {
            return 1;
        }
        
        int resultado = fatoriall(numero - 1) * numero;
        return resultado;
    }
}

public class Main {

    public static void main(String[] args) {

        try {
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o cálculo fatorial: "));
            
            if(numero<0){
                JOptionPane.showMessageDialog(null,"Valor anterior invalido.");
            }
            JOptionPane.showMessageDialog(null, "Resultado fatorial: " + new Fatorial().fatoriall(numero));
            
        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
}

