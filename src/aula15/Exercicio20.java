/*20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
As perguntas são:
* "Telefonou para a vítima?"
* "Esteve no local do crime?"
* "Mora perto da vítima?"
* "Devia para a vítima?"
* "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no
crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como 
"Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será
classificado como "Inocente".*/

package aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda sim ou não a estas perguntas sobre o trabalho:");
		System.out.print("Entrou em contato com a empresa? (S/N) ");
		String pergunta1 = scan.next();
		
		System.out.print("Foi entrevistado? (S/N) ");
		String pergunta2 = scan.next();
		
		System.out.print("Foi contratado? (S/N) ");
		String pergunta3 = scan.next();
		
		System.out.print("Continua trabalhando até hoje? (S/N) ");
		String pergunta4 = scan.next();
		
		System.out.print("Vai trabalhar hoje? (S/N) ");
		String pergunta5 = scan.next();
		
		int respostaPositiva = 0;
		
		if (pergunta1.equalsIgnoreCase("s")) {
			respostaPositiva++;
		}
		
		if (pergunta2.equalsIgnoreCase("s")) {
			respostaPositiva++;
		}

		if (pergunta3.equalsIgnoreCase("s")) {
			respostaPositiva++;
		}

		if (pergunta4.equalsIgnoreCase("s")) {
			respostaPositiva++;
		}
		
		if (pergunta5.equalsIgnoreCase("s")) {
			respostaPositiva++;
		}

		if (respostaPositiva <= 2) {
			System.out.println("Pode ser que a pessoa trabalhe na empresa.");
		} else if (respostaPositiva > 2 && respostaPositiva <=4) {
			System.out.println("È provável que a pessoa trabalhe na empresa.");
		} else if (respostaPositiva == 5) {
			System.out.println("A pessoa trabalha na empresa.");
		} else {
			System.out.println("A pessoa não trabalha na empresa.");
		}
	}
}
