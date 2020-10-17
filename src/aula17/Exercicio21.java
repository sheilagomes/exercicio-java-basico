/*21. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça
a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem
ter mais de 40 alunos.*/

package aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		int soma = 0;
		int estudantes = 0;

		System.out.println("Digite o número de turmas: ");
		int turmas = scan.nextInt();
		
		for (int i = 1; i <= turmas; i++) {
			do {
				System.out.println("Digite o número de estudantes da turma " + i + ": ");
				estudantes = scan.nextInt();
				
				if (estudantes <= 40) {
					valida = true;
				} else {
					System.out.println("Cada turma só pode ter 40 estudantes, tente de novo");
					System.out.println();
					valida = false;
				}
			} while (!valida);
			System.out.println("A turma " + i + " tem " + estudantes + " estudantes");
			soma += estudantes;
		}
		double media = soma / turmas; 
		System.out.println("O número médio de alunos por turma é " + media);
	}
}