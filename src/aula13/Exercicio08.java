//8. Faça um Programa que pergunte quanto você ganha por hora e o
//   número de horas trabalhadas no mês. Calcule e mostre o total
//   do seu salário no referido mês.
package aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite o número de horas trabalhadas: ");
		double numeroHoras = scan.nextDouble();
		double ValorTotal = valorHora * numeroHoras;
		System.out.println("O valor total é " + ValorTotal);
	}
}
