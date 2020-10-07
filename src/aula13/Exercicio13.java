/*13.Faça um Programa que pergunte quanto você ganha por hora e o 
 * número de horas trabalhadas no mês. Calcule e mostre o total do 
 * seu salário no referido mês, sabendo-se que são descontados 11% 
 * para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
 * faça um programa que nos dê:
 . salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$ 
Obs.: Salário Bruto - Descontos = Salário Líquido.*/

package aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite o número de horas trabalhadas: ");
		double numeroHoras = scan.nextDouble();
		double valorBruto = valorHora * numeroHoras;
		double valorIR = valorBruto * 0.11;
		double valorINSS = valorBruto * 0.08;
		double valorSindicato = valorBruto * 0.05;
		double valorLiquido = valorBruto - valorIR - valorINSS - valorSindicato; 
		System.out.println("Salário Bruto : R$ " + valorBruto);
		System.out.println("- IR (11%) : R$ " + valorIR);
		System.out.println("- INSS (8%) : R$ " + valorINSS);
		System.out.println("- Sindicato ( 5%) : R$ " + valorSindicato);
		System.out.println("= Salário Liquido : R$ " + valorLiquido);
	}
}
