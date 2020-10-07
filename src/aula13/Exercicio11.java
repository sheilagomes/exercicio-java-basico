/*11.Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo.
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/

package aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		double numInt1 = scan.nextDouble();
		System.out.println("Digite outro número inteiro: ");
		double numInt2 = scan.nextDouble();
		System.out.println("Agora digite um número real: ");
		double numReal = scan.nextDouble();
		double resposta1 = (numInt1 * 2) * (numInt2 / 2); 
		System.out.println("O produto do dobro do primeiro com metade do segundo é " + resposta1);
		double resposta2 = (numInt1 * 3) + numReal;
		System.out.println("A soma do triplo do primeiro com o terceiro é " + resposta2);
		double resposta3 = Math.pow(numReal,3);
		System.out.println("O terceiro elevado ao cubo é " + resposta3);
	}
}
