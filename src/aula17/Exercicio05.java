/*5. Altere o programa anterior permitindo ao usuário
informar as populações e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a operação.*/

package aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		double pais1, pais2, taxa1, taxa2;
		int contador = 0;
		boolean valido = false;

		do {
			System.out.println("Digite a população do país 1: ");
			pais1 = scan.nextDouble();
			
			if (pais1 <= 0) {
				System.out.println("O valor deve ser maior que 0! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;

		do {
			System.out.println("Digite a taxa de crescimento do país 1: ");
			taxa1 = scan.nextDouble();
			
			if (taxa1 <= 0) {
				System.out.println("O valor deve ser maior que 0! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite a população do país 2: ");
			pais2 = scan.nextDouble();
			
			if (pais2 <= 0) {
				System.out.println("O valor deve ser maior que 0! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;

		do {
			System.out.println("Digite a taxa de crescimento do país 1: ");
			taxa2 = scan.nextDouble();
			
			if (taxa2 <= 0) {
				System.out.println("O valor deve ser maior que 0! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;

		do {
			pais1 += (pais1 * (taxa1/100));
			pais2 += (pais2 * (taxa2/100));
			contador++;
		} while (pais1 < pais2);
			
		System.out.println("Depois de " + contador + " anos");
		System.out.println("a população do país 1 é " + Math.round(pais1));
		System.out.println("e a população do país 2 é " + Math.round(pais2));
	}
}