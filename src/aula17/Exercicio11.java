/*11. Altere o programa anterior para mostrar no final a
soma dos números.*/

package aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite o primeiro número");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int numero2 = scan.nextInt();
		
		for (int i=numero1; i<=numero2; i++){
            soma += i;
        }

		System.out.println("Soma dos números: " + soma);		
	}
}