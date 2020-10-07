//3. Faça um Programa que peça dois números e imprima a soma.
package aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número");
		int num2 = scan.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma dos dois números é " + soma);
	}
}
