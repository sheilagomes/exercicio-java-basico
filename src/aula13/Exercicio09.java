//9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9).

package aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double farenheit = scan.nextDouble();
		double celsius = (5 * (farenheit-32) / 9);
		System.out.println("A temperatura em graus Celsius é " + celsius);
	}
}
