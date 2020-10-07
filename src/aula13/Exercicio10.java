//10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

package aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
		double farenheit = ((celsius * 9/5) + 32);
		System.out.println("A temperatura em graus Farenheit é " + farenheit);
	}
}
