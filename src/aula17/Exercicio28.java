/*28. Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.*/

package aula17;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
        int numero = scan.nextInt();
		System.out.println(numero);
        int cont = 2;
		boolean primo = true;

		while (cont < numero) {
			if (numero % cont == 0) {
				primo = false;
				break;
			}
			cont += 1;
		}
		if (primo) {
			System.out.println("O número " + numero + " é primo");
		} else {
			System.out.println("O número " + numero + " não é primo");
		}
	}
}