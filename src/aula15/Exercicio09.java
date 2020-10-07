//9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

package aula15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite mais um número inteiro: ");
		int numero3 = scan.nextInt();
		
		int maior, medio, menor;
		
		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			menor = numero1;
			medio = numero2;
			maior = numero3;
		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			menor = numero1;
			medio = numero3;
			maior = numero2;
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			menor = numero2;
			medio = numero1;
			maior = numero3;
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1) {
			menor = numero2;
			medio = numero3;
			maior = numero1;
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
			menor = numero3;
			medio = numero2;
			maior = numero1;
		} else {
			menor = numero3;
			medio = numero1;
			maior = numero2;
		}
		
		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("Os três números são iguais.");
		} else {
			System.out.println("Os três números em ordem decrescente são " + maior + ", " + medio + " e " + menor);
		}
	}
}