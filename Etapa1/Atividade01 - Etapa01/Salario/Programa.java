package Salario;

import java.util.Scanner;

/*Contru um algoritmo que receba o n�mero de horas trabalhadas por uma pessoa 
e o valor do sal�rio m�nimo e mostre o sal�rio a receber baseado nas seguintes regras:
(a) A hora trabalhada equivale a 10% do sal�rio m�nimo informado. 
(b) O sal�rio bruto � dado pelo n�mero de horas trabalhadas multiplicado
pelo valor de cada hora. (c) O imposto pago � de 3%.
(d) O sal�rio a receber � equivalente ao sal�rio bruto subtra�do do imposto.*/

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------------------Sal�rio---------------------------\n");
		System.out.println("Quantas horas trabalhadas: ");
		float horas = scanner.nextFloat();
		System.out.println("Qual � o valor do salario por horas: ");
		float valorsalario = scanner.nextFloat();

		float salario_bruto = valorsalario * horas;
		float porcentagem_aumento = ((float) .1 * salario_bruto) + salario_bruto;
	
		System.out.println("------------------------------------------------------------\n");
		System.out.println("Valor do sal�rio final com acr�scimo e desconto de importo �: R$"
				+ ((porcentagem_aumento * .03) - porcentagem_aumento));

		scanner.close();
	}
}
