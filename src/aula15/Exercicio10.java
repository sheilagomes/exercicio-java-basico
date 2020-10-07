//10.Faça um Programa que pergunte em que turno você estuda.
//   Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
//   Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
//   ou "Valor Inválido!", conforme o caso.

package aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno em que você estuda: ");
		System.out.println("(M-Matutino V-Vespertino N-Noturno)");		
		String turno = scan.next();

		String turnoMaiusculo = turno.toUpperCase();
		
		switch(turnoMaiusculo) {
			case "M":
				System.out.println("Bom dia!");
				break;
			case "V":
				System.out.println("Boa tarde!");
				break;
			case "N":
				System.out.println("Boa noite!");
				break;
			default:
				System.out.println("Valor inválido!");
		}
	}
}