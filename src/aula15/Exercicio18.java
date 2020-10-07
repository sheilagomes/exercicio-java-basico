/*18.Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
Dica: utilize o operador módulo (resto da divisão).*/

package aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro para verificar se é par ou ímpar");
		int numero = scan.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é ímpar");
		}
	}
}