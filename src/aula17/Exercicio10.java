/*10. Faça um programa que receba dois números inteiros e
gere os números inteiros que estão no intervalo compreendido 
por eles.*/

package aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro número");
		numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		numero2 = scan.nextInt();
		
		for (int i=numero1; i<=numero2; i++){
            System.out.println(i);
        }

		System.out.println("Fim do programa!");		
	}
}