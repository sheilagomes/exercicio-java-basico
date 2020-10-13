/*8. Faça um programa que leia 5 números e informe a soma e 
a média dos números.*/

package aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int numero1, soma;
		double media;
		soma = 0;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "o. número: ");
			numero1 = scan.nextInt();
			soma += numero1; 
		}
		media = soma/5;
		System.out.println("A soma dos números é " + soma + " e a média é " + media);
	}
}