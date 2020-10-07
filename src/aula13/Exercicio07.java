//7. Faça um Programa que calcule a área de um quadrado,
//   em seguida mostre o dobro desta área para o usuário.
package aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado,2);
		double dobroArea = area * 2;
		System.out.println("A área do quadrado é " + area + " e o dobro da área é " + dobroArea);
	}
}
