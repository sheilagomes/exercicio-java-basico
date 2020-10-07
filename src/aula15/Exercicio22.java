/*22.Uma fruteira está vendendo frutas com a seguinte tabela de preços:
          Até 5 Kg         Acima de 5 Kg
Morango   R$ 2,50 por Kg   R$ 2,20 por Kg
Maçã      R$ 1,80 por Kg   R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar
R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para
ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva
o valor a ser pago pelo cliente.*/

package aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a quantidade (em Kg) de morangos?");
		double morangos = scan.nextDouble();
		
		System.out.println("Qual é a quantidade (em Kg) de maçãs?");
		double macas = scan.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
		
		if (morangos > 5) {
			precoMorango = 2.2;
		} else {
			precoMorango = 2.5;
		}
		
		if (macas > 5) {
			precoMaca = 1.5;
		} else {
			precoMaca = 1.8;
		}
		
		double valorFinal = (morangos * precoMorango) + (macas * precoMaca);
		
		if ((macas + morangos) >= 8 || valorFinal >= 25) {
			valorFinal = valorFinal - (valorFinal * 0.1);
		}
		
		System.out.println("O valor a pagar é de " + valorFinal);
	}

}
