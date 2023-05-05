package Salario;

import java.util.Scanner;

/*Contru um algoritmo que receba o número de horas trabalhadas por uma pessoa 
e o valor do salário mínimo e mostre o salário a receber baseado nas seguintes regras:
(a) A hora trabalhada equivale a 10% do salário mínimo informado. 
(b) O salário bruto é dado pelo número de horas trabalhadas multiplicado
pelo valor de cada hora. (c) O imposto pago é de 3%.
(d) O salário a receber é equivalente ao salário bruto subtraído do imposto.*/

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------------------Salário---------------------------\n");
		System.out.println("Quantas horas trabalhadas: ");
		float horas = scanner.nextFloat();
		System.out.println("Qual é o valor do salario por horas: ");
		float valorsalario = scanner.nextFloat();

		float salario_bruto = valorsalario * horas;
		float porcentagem_aumento = ((float) .1 * salario_bruto) + salario_bruto;
	
		System.out.println("------------------------------------------------------------\n");
		System.out.println("Valor do salário final com acréscimo e desconto de importo é: R$"
				+ ((porcentagem_aumento * .03) - porcentagem_aumento));

		scanner.close();
	}
}
