//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro bimestre: ");
		float bim1 = scan.nextFloat();
		System.out.println("Digite a nota do segundo bimestre: ");
		float bim2 = scan.nextFloat();
		System.out.println("Digite a nota do terceiro bimestre: ");
		float bim3 = scan.nextFloat();
		System.out.println("Digite a nota do quarto bimestre: ");
		float bim4 = scan.nextFloat();
		float media = (bim1 + bim2 + bim3 + bim4)/4;
		System.out.println("A média é " + media);
	}
}
