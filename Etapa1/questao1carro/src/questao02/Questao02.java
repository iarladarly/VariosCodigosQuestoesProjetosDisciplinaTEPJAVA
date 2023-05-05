
package questao02;

import javax.swing.JOptionPane;

public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            float distancia = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância percorrida pelo automovel, em km: "));
            float horas = Float.parseFloat(JOptionPane.showInputDialog("Informe o intervalo de tempo correspondente em horas: "));
            float quilometragem = Float.parseFloat(JOptionPane.showInputDialog("Informe a quilometragem percorrida com 1 L de gasolina: "));
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do litro de gasolina: "));
            
            float Vmedia1= distancia/horas;
            float Vmedia2= (float) (Vmedia1/3.6);
            float total = ((distancia/quilometragem)/valor)*2;
            JOptionPane.showMessageDialog(null, "A distância percorrida em km/h é "+Vmedia1, "Velocidade Média 1", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,String.format( "A distância percorrida em m/s é %.2f",Vmedia2),"Velocidade Média 2", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, "A gasolina consumida para ir e voltar custará "+total+" R$", "Valor Total", JOptionPane.PLAIN_MESSAGE);
            
        }
        catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Valor inválido ", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
