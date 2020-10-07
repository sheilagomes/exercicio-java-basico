/*23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
             Até 5 Kg         Acima de 5 Kg
File Duplo   R$ 4,90 por Kg   R$ 5,80 por Kg
Alcatra      R$ 5,90 por Kg   R$ 6,80 por Kg
Picanha      R$ 6,90 por Kg   R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne
da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a
compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário
e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne,
preço total, tipo de pagamento, valor do desconto e valor a pagar.*/

package aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o tipo de carne?");
		System.out.println("F-File Duplo A-Alcatra P-Picanha");
		String tipoCarne = scan.next();
		
		System.out.println("Quantos kg?");
		double quantosKg = scan.nextDouble();

		System.out.println("Tem cartão Tabajara? (S/N)");
		String cartaoTabajara = scan.next();
		
		double precoCarne = 0;
		double valorTotal = 0;
		double desconto = 0;
		double valorFinal = 0;
		boolean valida = true;
		String tipoPagamento = null;
		
		switch(tipoCarne.toUpperCase()) {
			case "F":
				if (quantosKg <= 5) {
					precoCarne = 4.9;
				} else {
					precoCarne = 5.8;
				}
				valorTotal = quantosKg * precoCarne;
				break;
			case "A":
				if (quantosKg <= 5) {
					precoCarne = 5.9;
				} else {
					precoCarne = 6.8;
				}
				valorTotal = quantosKg * precoCarne;
				break;
			case "P":
				if (quantosKg <= 5) {
					precoCarne = 6.9;
				} else {
					precoCarne = 7.8;
				}
				valorTotal = quantosKg * precoCarne;
				break;
			default:
				System.out.println("Tipo inválido!");
				valida = false;
		}
		
		if (valida) {
			if (cartaoTabajara.equalsIgnoreCase("s")) {
				desconto = valorTotal * 0.05;
				valorFinal = valorTotal - desconto;
				tipoPagamento = "Cartão Tabajara";
			} else {
				valorFinal = valorTotal;
				tipoPagamento = "Sem cartão";
			}
			
			System.out.println("Tipo de carne     : " + tipoCarne);
			System.out.println("Quantidade        : " + quantosKg);
			System.out.println("Preço total       : " + valorTotal);
			System.out.println("Tipo de pagamento : " + tipoPagamento);
			System.out.println("Valor do desconto : " + desconto);
			System.out.println("Valor a pagar     : " + valorFinal);
		} else {
			System.out.println("Compra inválida");
		}
	}
}
