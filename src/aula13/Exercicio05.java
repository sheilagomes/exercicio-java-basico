//5. Faça um Programa que converta metros para centímetros.
package aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor a converter: ");
		
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		
		System.out.println("O valor de " + metros + " m equivale a " + centimetros + " cm.");
	}
}
