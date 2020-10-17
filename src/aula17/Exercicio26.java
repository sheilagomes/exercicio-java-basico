/*26. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
Fatorial de: 5
5! =
5 . 4 . 3 . 2 . 1 = 120*/

package aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = scan.nextInt();
		
		int fat = 1;
		System.out.println("Fatorial de: " + numero);
		System.out.println(numero + "! =");
		//5 . 4 . 3 . 2 . 1 = 120*/
		for (int i = 0; i < numero ; i++) {
			if (numero-i > 1) {
				System.out.print(numero-i + " . ");
			}
			fat *= numero-i;
		}
		System.out.print("1 = " + fat);
	}

}
