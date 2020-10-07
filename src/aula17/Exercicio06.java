/*6. Faça um programa que imprima na tela os números de 1 a
20, um abaixo do outro. Depois modifique o programa para que
ele mostre os números um ao lado do outro.*/

package aula17;

public class Exercicio06 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 21; i++) {
			System.out.println(i);	
		}
		
		for (int i = 1; i < 21; i++) {
			System.out.print(i + " ");	
		}
	}
}
