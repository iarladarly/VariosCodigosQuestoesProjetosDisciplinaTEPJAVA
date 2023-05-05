/*
2. Elabore um algoritmo que receba um número e em seguida mostrar e sequência de fibonacci.
Caso não seja possível imprimir mensagem de aviso.
 */
package fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {

    static int fibonaccii(int numero) {
        if (numero==1 || numero==2) {
            return 1;
        } else {
            return fibonaccii(numero - 1) + fibonaccii(numero - 2);
        }
    }

    public static void main(String[] args) {
        
         try {
            
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o cálculo de fibonacci: "));
            if(numero<=0){
                JOptionPane.showMessageDialog(null,"Valor anterior invalido.");
            }
            for(int i=1; i<=numero; i++){
            JOptionPane.showMessageDialog(null, "Resultado da sequência de fibonacci:\n " + fibonaccii(i));
            }
        }

        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

	
    }

    }

