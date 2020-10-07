//2. Faça um Programa que peça um valor e 
//   mostre na tela se o valor é positivo ou negativo.

package aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double numero1 = scan.nextDouble();
		if (numero1 == 0) {
			System.out.println("O número é zero.");
		} else if (numero1 > 0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negativo.");
		}
	}

}
