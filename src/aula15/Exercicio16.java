/*16.Faça um programa que calcule as raízes de uma equação do segundo grau, na forma
ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências,
informando ao usuário nas seguintes situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
programa não deve fazer pedir os demais valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao
usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real;
informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/

package aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três valores inteiros para a equação ax2 + bx + c");
		System.out.println("Digite o valor de a:");
		int valorA = scan.nextInt();
		
		System.out.println("Digite o valor de b:");
		int valorB = scan.nextInt();
		
		System.out.println("Digite o valor de c:");
		int valorC = scan.nextInt();
		
		double delta = Math.pow(valorB,2) - (4 * (valorA * valorC));
		
		if (valorA == 0) {
			System.out.println("A equação não é do segundo grau");
		} else if (delta < 0) {
			System.out.println("Como o delta é negativo, a equação não tem raizes reais");
		} else if (delta == 0) {
			System.out.println("Como o delta é igual a 0, a equação tem apenas uma raiz, que é " + (-valorB));
		} else if (delta > 0) {
			double x1 = (-valorB + Math.sqrt(delta))/(2*valorA);
		    double x2 = (-valorB - Math.sqrt(delta))/(2*valorA);
		    System.out.println("Como o delta é positivo, as raízes da equação são " + x1 + " e " + x2);
		}
	}
}