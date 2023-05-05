package questao02;
import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        
        try{
            
            int somapar=0, somaimpar=0;
               
               for(int i=1; i<=500;i++){

                   if(i%2==0){
                        somapar+=i;
                   }
                   else if(i%2!=0){
                        somaimpar+=i;   
                   }
                }
               
               JOptionPane.showMessageDialog(null, "-------------------\t\t\t\t\t\t\t\t        1 a 500      \t\t\t\t\t\t\t\t\t----------------------\n\n"+"Soma "
                       + "dos numeros pares: " +somapar+ "\nSoma dos numeros impares: "+somaimpar
               +"\nResultado da soma par e impar "+(somapar+somaimpar));  
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor Invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        System.exit(0);
    }
    
}

    
    

