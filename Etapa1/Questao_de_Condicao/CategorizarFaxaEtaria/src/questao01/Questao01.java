/*
 #1. Elabore um algoritmo que dada a idade de um nadador classifica-a em
uma das seguintes categorias: infantil A = 5 - 7 anos; infantil B = 8-10 anos;
juvenil A = 11-13 anos; juvenil B = 14-17 anos; adulto = maiores de 18 anos.
Obs1. Não aceitar idade negativa nem maiores de 125 anos. Obs2. Crianças abaixo
de 5 anos não se enquadram em nenhuma categoria. 
Obs3. Utilizar estrutura de seleção simples e estrutura de múltipla escolha.
 */

package questao01;
import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        try 
        {
            
            
            byte idade; 
            String msg = "";   
            idade = Byte.parseByte(JOptionPane.showInputDialog(null, "Insira sua idade"));
            if (idade<5 || idade>=125) 
            {
                throw new IllegalArgumentException("Idade ivalida para essa categoria");
            }
             switch(idade) 
            {                           
                case 5: case 6: case 7: msg="Categoria que se enquada:\n Infantil A= 5 - 7 anos" ;
                break;            
                
                case 8: case 9: case 10: msg = "Categoria que se enquadra:\n Infantil B= 8 - 10 anos";
                break;
                              
                case 11: case 12: case 13: msg = "Categoria que se enquadra:\n juvenil A = 11-13 anos";
                break;
                              
                case 14: case 15: case 16: case 17: msg = "Categoria que se enquadra:\n juvenil B = 14-17 anos";    
                break;

                default: msg = "Categoria que se enquadra:\n adulto maiores de 18 anos";
            break;
                    
            }
             JOptionPane.showMessageDialog(null, msg, "Categoria", JOptionPane.INFORMATION_MESSAGE);
        }
    catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Idade invalida para essa classificação!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    

