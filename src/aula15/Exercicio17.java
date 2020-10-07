/*17.Faça um Programa que peça um número correspondente a um determinado ano e
em seguida informe se este ano é ou não bissexto.*/

package aula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um ano para verificar se é bissexto");
		System.out.println("Digite o ano:");
		int ano = scan.nextInt();
		
		if ((ano%400 == 0) || (ano%4 == 0 && ano%100 != 0)) {
			System.out.println("Este ano é bissexto.");
		} else {
			System.out.println("Este ano não é bissexto.");
		}
	}
}
