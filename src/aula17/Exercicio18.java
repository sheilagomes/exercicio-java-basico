/*18. Faça um programa que peça um número inteiro e determine se ele é ou não um número
primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.*/

package aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}
	}
}
