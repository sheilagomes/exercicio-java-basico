//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do círculo: ");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio,2);
		System.out.println("A área do círculo é: " + area);
	}
}
