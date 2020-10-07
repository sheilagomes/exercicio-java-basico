//8. Faça um programa que pergunte o preço de três produtos e
//   informe qual produto você deve comprar, sabendo que a decisão
//   é sempre pelo mais barato.

package aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto: ");
		double preco1 = scan.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		double preco2 = scan.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto: ");
		double preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("O primeiro produto é mais barato, compre este.");
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("O segundo produto é mais barato, compre este.");
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("O terceiro produto é mais barato, compre este.");
		}
				
		if (preco1 == preco2 && preco2 == preco3) {
			System.out.println("Os três produtos têm o mesmo preço, compre qualquer um.");
		}
	}

}