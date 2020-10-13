/*13. Faça um programa que peça dois números, base e
expoente, calcule e mostre o primeiro número elevado ao
segundo número. Não utilize a função de potência da
linguagem.*/

package aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a base: ");
		int base = scan.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = scan.nextInt();
		
		int resultado = 1;
		
		for (int i = 1; i <= expoente; i++) {
			resultado *= base;			
		}
		
		System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
	}
}
