
package Carro;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Carro {

    public static void main(String[] args) {
        
        try{
           double custof = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica do carro: "));
           double custoc = (custof * 1.28) * 1.45;
           
           DecimalFormat df = new DecimalFormat("0.00");
           
           JOptionPane.showMessageDialog(null, "O custo ao consumidor é R$" + df.format(custoc));
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Número inválido ", "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        finally{
            System.out.println("Questão 04 com try-catch");
        }
    }
}
