package inverterposicoes;

import java.util.Scanner;

public class inverterposicoes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float auxiliar;
		System.out.println("----Inverter posições----\n");
		System.out.println("Digite o primeiro numero: ");
		float numero1 = scanner.nextFloat();
		System.out.println("Digite o segundo numero: ");
		float numero2 = scanner.nextFloat();
		System.out.println("O primeiro numero digitado: " + numero1 + "O segundo numero digitado: " + numero2);
		auxiliar = numero1;
		numero1 = numero2;
		numero2 = auxiliar;
		System.out.println("Posições dos números trocadas " + numero1 + ", " +numero2);

		scanner.close();
	}
}
