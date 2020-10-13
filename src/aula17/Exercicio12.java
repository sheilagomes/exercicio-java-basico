/*12. Desenvolva um gerador de tabuada, capaz de gerar a
tabuada de qualquer número inteiro entre 1 a 10. O usuário
deve informar de qual numero ele deseja ver a tabuada. A
saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50*/

package aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		
		do {
			System.out.println("Digite um número entre 0 e 10: ");
			int numero = scan.nextInt();
			
			if (numero < 0 || numero > 10) {
				System.out.println("O número deve estar entre 0 e 10. Tente de novo!");
			} else {
				System.out.println("Tabuada de " + numero);
				
				for (int i = 1; i <= numero; i++) {
					System.out.println(numero + " X " + i + " = " + (numero*i));
				}
				valida = true;
			}
			
		} while (!valida);
	}

}
