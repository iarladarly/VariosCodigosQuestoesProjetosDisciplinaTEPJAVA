/* Questão 01
* IFCE - Instituto Federal do Ceará - Campus Tianguá-CE
* Equipe: Alex Wesley, Jordan Ferreira, Iarla Darly e Andressa Silva
* 4º Semestre (Bacharelado em Ciência da Computação) - 2021.1
* Disciplina: Tópicos Especiais em Programação
*/

package questao01;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Questao01 {

    public static void main(String[] args) {
        
        //TRATAMENTO DE ERRO- TRY CATCH
        try{
        //CRIAR AS VARIÁVEIS
        int horas_trabalhadas, horas_extras;
        double valor_salario, porcentagem1 =0.0786 , porcentagem2=0.1376;
        double salario_bruto, calculo_horas_extras, salario_final;
        //CONVERSÃO DAS VARIÁVEIS
        horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas trabalhadas: "));
        valor_salario = Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor do salário: "));
        horas_extras = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas extras trabalhadas: "));
        //PROCESSAMENTO
        salario_bruto = ((valor_salario *porcentagem1)*horas_trabalhadas);   
        calculo_horas_extras = ((valor_salario*porcentagem2)*horas_extras);
        salario_final = (salario_bruto + calculo_horas_extras);
        //O NÚMERO FORMATADO TERÁ DUAS CASAS DECIMAIS
        DecimalFormat df = new DecimalFormat("0.00");
        //SAÍDA DE DADOS
        JOptionPane.showMessageDialog(null, "Valor do salario final é R$ " + df.format(salario_final));
        }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Número inválido ", "ERRO",JOptionPane.ERROR_MESSAGE);
        }
        //SAIR DO SISTEMA
        System.exit(0);
    }
}
