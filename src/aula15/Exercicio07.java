//7. Faça um Programa que leia três números e mostre o maior e o menor deles.

package aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double numero3 = scan.nextDouble();
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O número " + numero1 + " é o menor dos três.");
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O número " + numero2 + " é o menor dos três.");
		} else if (numero3 < numero1 && numero3 < numero2) {
			System.out.println("O número " + numero3 + " é o menor dos três.");
		}
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O número " + numero1 + " é o maior dos três.");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O número " + numero2 + " é o maior dos três.");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O número " + numero3 + " é o maior dos três.");
		}
		
		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("Os três números são iguais");
		}
	}
}