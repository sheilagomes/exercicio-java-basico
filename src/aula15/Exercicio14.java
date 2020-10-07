/*14.Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina
ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à
tabela abaixo:
* Média de Aproveitamento Conceito
* Entre 9.0 e 10.0           A
* Entre 7.5 e 9.0            B
* Entre 6.0 e 7.5            C
* Entre 4.0 e 6.0            D
* Entre 4.0 e zero           E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a
mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

package aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		String conceito = null;
		
		if (media >= 9 && media < 10) {
			conceito = "A";
		} else if (media < 9 && media >= 7.5) {
			conceito = "B";
		} else if (media < 7.5 && media >= 6) {
			conceito = "C";
		} else if (media < 6 && media >= 4) {
			conceito = "D";
		} else if (media < 4) {
			conceito = "E";
		}
		
		System.out.println("Notas: " + nota1 + " e " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		if (conceito == "A" || conceito == "B" || conceito == "C") {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}