//5. Faça um programa para a leitura de duas notas parciais
//   de um aluno. O programa deve calcular a média alcançada
//   por aluno e apresentar: a mensagem "Aprovado", se a média
//   alcançada for maior ou igual a sete; a mensagem "Reprovado",
//   se a média for menor do que sete; o A mensagem "Aprovado
//   com Distinção", se a média for igual a dez.

package aula15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}