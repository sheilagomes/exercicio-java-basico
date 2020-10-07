//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
package aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		String num = scan.next();
		System.out.println("O número informado foi " + num);
	}
}
