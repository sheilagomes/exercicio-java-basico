/*17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
usuário. Ex.: 5!=5.4.3.2.1=120*/

package aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Digite um número inteiro: ");
		int numero = scan.nextInt();
		
		for (int i = numero; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + numero + " é " + fatorial);
		
	}

}
