/*19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
se o número é:
* par ou ímpar;
* positivo ou negativo;*/

package aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números e a operação que quer fazer com eles");
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite a operação desejada (+ - * /): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
			case "+":
				resultado = numero1 + numero2;
	 			System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + resultado);
				break;
			case "-":
				resultado = numero1 - numero2;
	 			System.out.println("A subtração de " + numero1 + " e " + numero2 + " é " + resultado);
				break;
			case "*":
				resultado = numero1 * numero2;
	 			System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é " + resultado);
				break;
			case "/":
				if (numero2 == 0) {
					System.out.println("Esta operação não é válida, o segundo número não pode ser 0 em uma divisão");
					valida = false;
				} else {
					resultado = numero1 / numero2;
					System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
				}
				break;
			default:
	 			System.out.println("Esta operação não é válida");
	 			valida = false;
		}
			
		if (valida) {
			if (resultado%2 == 0) {
				System.out.print("O resultado é par e ");
			} else {
				System.out.print("O resultado é ímpar e ");
			}
			
			if (resultado > 0) {
				System.out.print("positivo");
			} else {
				System.out.print("negativo");
			}
		}
	}
}
