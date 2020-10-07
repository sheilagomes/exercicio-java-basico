/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
informações.*/

package aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		do {			
			
			System.out.println("Digite seu nome:");
			String nome = scan.next();
			
			System.out.println("Digite sua senha:");
			String senha = scan.next();
			
			if (nome.equalsIgnoreCase(senha)){
				System.out.println("A senha não pode ser igual ao nome! Tente de novo.");
			} else {
				System.out.println("Obrigada!");
				valido = true;
			}
			
		} while (!valido);
		System.out.println("FIM!");
	}
}