/*19. Faça um programa que calcule o mostre a média aritmética de N notas.*/

package aula17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de notas: ");
		double numero = scan.nextDouble();
		
		double soma = 0;
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Digite a " + i + "a. nota");
			double nota = scan.nextDouble();
			soma += nota;
		}
		
		System.out.println("A média é " + soma/numero);
	}
}