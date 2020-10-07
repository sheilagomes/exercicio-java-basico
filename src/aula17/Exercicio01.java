/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o
valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/

package aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int nota = 0;
		
		do {
			System.out.println("Digite uma nota entre 0 e 10:");
			nota = scan.nextInt();
			
			if (nota < 0 || nota > 10) {
				System.out.println("VALOR INVÁLIDO! Tente de novo.");
				nota = 0;
			} else {
				System.out.println("Obrigada!");
				nota = 11;
			}
			
		} while (nota >= 0 && nota <= 10);
		System.out.println("FIM!");
	}
}