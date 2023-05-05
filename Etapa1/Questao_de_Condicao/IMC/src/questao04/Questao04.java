/*Questão Faça um algoritmo para calcular o IMC de uma pessoa de acordo com a imagem abaixo. 
Obs. Não considerar valores de entrada negativos*/
package questao04;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Questao04 {
    public static void main(String[] args) {

        //TRATAMENTO DE ERRO- TRY CATCH
            try {
                //CRIAÇÃO AS VARIÁVEIS 
                float calculoimc, peso, altura;

                peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));

                //CONDIÇÃO
                if (peso <= 0.0 || altura <= 0.0) {
                    throw new IllegalArgumentException();
                }
                //O NÚMERO FORMATADO TERÁ DUAS CASAS DECIMAIS
                DecimalFormat df = new DecimalFormat("0.00");

                //PROCESSAMENTO
                //CALCULO
                calculoimc = (peso / (altura * altura));
                //CONDIÇÕES
                if (calculoimc <= 18.5) {
                    JOptionPane.showMessageDialog(null, "Resultado do imc  " + df.format(calculoimc)
                            + " mostra que está abaixo do peso ideal");
                }
                else if (calculoimc <= 18.5 || calculoimc <= 25.0) {
                    JOptionPane.showMessageDialog(null, "Resultado do imc  " + df.format(calculoimc)
                            + " está no peso ideal.");
                }
                else if (calculoimc >= 25.0 || calculoimc <= 30.0) {
                    JOptionPane.showMessageDialog(null, "Resultado do imc  " + df.format(calculoimc)
                            + " está acima do peso ideal.");
                }
                else if (calculoimc >= 30.0) {
                    JOptionPane.showMessageDialog(null, "Resultado do imc  " + df.format(calculoimc)
                            + " está obeso.");
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            //SAIR DO SISTEMA
            System.exit(0);
    } 
}
