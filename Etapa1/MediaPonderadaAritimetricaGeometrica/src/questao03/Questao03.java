package questao03;
/*IFCE – Instituto Federal do Ceará – Campus Tianguá
Equipe: Andressa, Wesley, Iarla, Jordan.
4° Semestre (Bacharelado em Ciência da Computação) 2021.1
Disciplina: Tópicos Especiais em Programação.*/
import javax.swing.JOptionPane;
public abstract class Questao03 {

    public static void main(String[] args) {
        try {
            //ler os 15 numeros, iremos guardar em um vetor
            int numeros[] = new int[15];
            JOptionPane.showMessageDialog(null, "Informe os 15 valores");
            for (int i = 0; i<15; i++) {
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:  "));
            }
            JOptionPane.showMessageDialog(null,"Informe os 5 pesos para a media ponderada");
            //ler os 5 pesos para a media ponderada, guardado em vetor
            int pesos[] = new int[5];
            for (int i = 0; i < 5; i++) {
                pesos[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da media ponderada"));
            }
            //media aritmetica dos 5 primeiros
            double mediaArit = 0.0;
            for (int i = 0; i < 5; i++) {
                mediaArit += numeros[i];
            }
            mediaArit /= 5.0;
            JOptionPane.showMessageDialog(null, "Media aritmetica dos 5 primeiros numeros: " + mediaArit);
            //Media ponderada dos 5 seguintes
            double mediaPond = 0.0, somaPesos = 0.0;
            for (int i = 5; i < 10; i++) {
            //pesos[i-5] pois i começa com o valor 5
            //porém o vetor peso inicia em 0, logo i - 5 ira percorre de 0 até 4, os 5 pesos
                mediaPond += (numeros[i] * pesos[i - 5]);
                somaPesos += pesos[i - 5];
            }
            mediaPond /= somaPesos;
            JOptionPane.showMessageDialog(null, "Media ponderada dos 5 seguintes numeros: " + mediaPond);
            //Media geometrica dos ultimos 5
            double mediaGeo = 1.0;
            for (int i = 10; i < 15; i++) {
                mediaGeo *= numeros[i];
            }
            mediaGeo = Math.pow(mediaGeo, (1.0 / 5.0));
            JOptionPane.showMessageDialog(null, "Media geometrica dos 5 ultimos numeros: " + mediaGeo);
            //media geometrica das 3 medias
            double mediaGeoMedias = mediaArit * mediaPond * mediaGeo;
            mediaGeoMedias = Math.pow(mediaGeoMedias, (1.0 / 3.0));
            JOptionPane.showMessageDialog(null, "Media geometrica das 3 medias: " + mediaGeoMedias);
        } catch (ArithmeticException n) {
            JOptionPane.showMessageDialog(null, "divisão por zero", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
