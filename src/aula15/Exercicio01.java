//1. Faça um Programa que peça dois números e imprima o maior deles.
package aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double numero1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		double numero2 = scan.nextDouble();
		if (numero1 == numero2) {
			System.out.println("Os números são iguais.");
		} else if (numero1 > numero2) {
			System.out.println("O número " + numero1 +" é maior que o número " + numero2);
		} else {
			System.out.println("O número " + numero2 +" é maior que o número " + numero1);
		}
	}

}
