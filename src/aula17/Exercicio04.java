/*4. Supondo que a população de um país A seja da ordem de
80000 habitantes com uma taxa anual de crescimento de 3% e
que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva
o número de anos necessários para que a população do país A
ultrapasse ou iguale a população do país B, mantidas as taxas
de crescimento.*/

package aula17;

public class Exercicio04 {

	public static void main(String[] args) {

		double paisA = 80000;
		double paisB = 200000;
		int contador = 0;
		
		do {
			paisA += paisA * 0.030;
			paisB += paisB * 0.015;
			contador++;
		} while (paisA < paisB);
		
		System.out.println("A população do país A levou " + contador + " anos para se igualar ou ultrapassar a do país B");
		System.out.println("População do país A: " + Math.round(paisA));
		System.out.println("População do país B: " + Math.round(paisB));
	}
}