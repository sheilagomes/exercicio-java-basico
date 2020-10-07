//3. Faça um Programa que verifique se uma letra digitada é "F"
//   ou "M". Conforme a letra escrever: F - Feminino, M - Masculino,
//   Sexo Inválido.

package aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o gênero (F ou M): ");
		String genero = scan.next();
		
		if (genero.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (genero.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Outro gênero.");
		}
	}

}
