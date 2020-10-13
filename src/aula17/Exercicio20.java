/*20. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e
então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.*/

package aula17;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número de pessoas: ");
		int pessoas = scan.nextInt();

		int soma = 0;

		for (int i = 1; i <= pessoas; i++) {

			System.out.println("Digite o idade da pessoa " + i + ": ");
			int idade = scan.nextInt();

			soma += idade;
		}
		
		double media = soma / pessoas;
		
		if (media >=0 && media <=25) {
			System.out.println("A turma é jovem");
		} else if (media > 25 && media <=60) {
			System.out.println("A turma é adulta");
		} else {
			System.out.println("A turma é idosa");
		}
	}
}