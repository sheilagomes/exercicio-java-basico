/*22. Faça um programa que calcule o valor total investido 
por um colecionador em sua coleção de CDs e o valor médio
gasto em cada um deles. O usuário deverá informar a
quantidade de CDs e o valor para em cada um.*/

package aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		int soma = 0;
		double cd = 0;

		System.out.println("Digite o número de CDs: ");
		int numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			do {
				System.out.println("Digite o valor do CD " + i + ": ");
				cd = scan.nextDouble();
				
				if (cd > 0) {
					valida = true;
				} else {
					System.out.println("O valor deve ser maior que zero, tente de novo");
					System.out.println();
					valida = false;
				}
			} while (!valida);
			System.out.println("O CD " + i + " custou R$ " + cd);
			soma += cd;
		}
		double media = soma / numero; 
		System.out.println("O valor médio pago por CD é " + media);
	}
}
