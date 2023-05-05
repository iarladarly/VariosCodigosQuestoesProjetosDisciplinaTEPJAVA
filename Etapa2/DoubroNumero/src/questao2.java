import javax.swing.JOptionPane;
//Construa um algoritmo que receba 10 números inteiros e retorno o seu dobro. 
//Obs. Usa funções sem passagem de parâmetro e sem retorno. 

public class questao2 
{
    static int valor, dobro[] = new int[10];
    static String msg="O dobro dos valores digitados é \n";
    
    public static void main(String[] args) 
    {
        try 
        {
            calcula_dobro(); 
        } 
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Valor Incorreto", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void calcula_dobro()
            
    {
       
        for (int i = 0; i < 10; i++) {           
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual valor que deseja calcular o seu dobro?"));
            dobro[i] = 2 * valor;
            msg += dobro[i]+" \t ";
        }
        JOptionPane.showMessageDialog(null, msg, "Dobro", JOptionPane.INFORMATION_MESSAGE);
    }
}

