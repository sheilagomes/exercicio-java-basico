/*14. Faça um programa que peça 10 números inteiros,
calcule e mostre a quantidade de números pares e a
quantidade de números impares.*/

package aula17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int impar = 0;
		int par = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "o. número");
			int numero = scan.nextInt();
		
			if (numero%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Número(s) par(es): " + par);
		System.out.println("Número(s) ímpar(es): " + impar);	
	}
}
