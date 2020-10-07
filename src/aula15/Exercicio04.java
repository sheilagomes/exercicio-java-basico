//4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

package aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
				System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		String letraMaiuscula = letra.toUpperCase();
		
		switch(letraMaiuscula) {
			case "A":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;
			case "E":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;
			case "I":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;
			case "O":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;
			case "U":
				System.out.println("A letra " + letra + " é uma vogal.");
				break;			
			default:
				System.out.println("A letra " + letra + " é uma consoante.");
		}
	}
}