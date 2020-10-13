/*7. Faça um programa que leia 5 números e informe o
maior número.*/

package aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int numero1, numero2;
		numero1 = 0;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Digite o " + i + "o. número: ");
			numero2 = scan.nextInt();
			
			if (numero2 > numero1) {
				numero1 = numero2;
			}
		}
		
		System.out.println("O maior número é " + numero1);
	}
}
