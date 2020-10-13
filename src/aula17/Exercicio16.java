/*16. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça
um programa que gere a série até que o valor seja maior que 500.*/

package aula17;

public class Exercicio16 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 1;
		int numero3 = numero1 + numero2;

		System.out.println(numero2);

		while (numero3 <= 500) {
			System.out.println(numero3);
			numero1 = numero2;
			numero2 = numero3;
			numero3 = numero1 + numero2;
		}
	}
}