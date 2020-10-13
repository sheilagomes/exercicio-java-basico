/*15. A série de Fibonacci é formada pela seqüência 1,1,2,3,
5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.*/

package aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de termos da série: ");
		int termo = scan.nextInt();
		
		int numero1 = 0;
		int numero2 = 1;
		int numero3 = numero1 + numero2;
		
		System.out.println(numero2);
		
		for (int i = 0; i < termo-1; i++) {
			System.out.println(numero3);
			numero1 = numero2;
			numero2 = numero3;
			numero3 = numero1 + numero2;
		}
	}
}
