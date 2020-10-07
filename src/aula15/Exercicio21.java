/*21.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
* até 20 litros, desconto de 3% por litro
* acima de 20 litros, desconto de 5% por litro
Gasolina:
* até 20 litros, desconto de 4% por litro
* acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
(codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do
litro do álcool é R$ 1,90.*/

package aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual é o tipo de combustível? (A-álcool, G-gasolina) ");
		String tipoCombustivel = scan.next();
		
		System.out.print("Quantos litros? ");
		double litros = scan.nextInt();
		
		double valorAPagar = 0;
		
		if (tipoCombustivel.equalsIgnoreCase("g") && litros <= 20) {
			double total = 2.5 * litros;
			double desconto = total * 0.04;
			valorAPagar = total - desconto;
		} else if (tipoCombustivel.equalsIgnoreCase("g") && litros > 20) {
			double total = 2.5 * litros;
			double desconto = total * 0.06;
			valorAPagar = total - desconto;
		} else if (tipoCombustivel.equalsIgnoreCase("a") && litros <= 20) {
			double total = 1.9 * litros;
			double desconto = total * 0.03;
			valorAPagar = total - desconto;
		} else if (tipoCombustivel.equalsIgnoreCase("a") && litros < 20) {
			double total = 1.9 * litros;
			double desconto = total * 0.05;
			valorAPagar = total - desconto;
		}
		
		System.out.println("O valor a ser pago é de " + valorAPagar);
	}
}
