/*12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos
são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para
o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a
empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
trabalhadas no mês.
Desconto do IR:
* Salário Bruto até 900 (inclusive) - isento
* Salário Bruto até 1500 (inclusive) - desconto de 5%
* Salário Bruto até 2500 (inclusive) - desconto de 10%
* Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00*/

package aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double valorHora, horasTrabalhadas, salarioBruto, percentualIR, valorIR, valorINSS, sindicato, valorFGTS, totalDescontos, salarioLiquido;
		
		System.out.println("Digite o valor hora do funcionário: ");
		valorHora = scan.nextDouble();
		
		System.out.println("Digite as horas trabalhadas do funcionário: ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		percentualIR = 0;
		
		if (salarioBruto <= 900) { 
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		
		valorIR = salarioBruto * (percentualIR/100);
		valorINSS = salarioBruto * 0.10;
		valorFGTS = salarioBruto * 0.11;
		sindicato = salarioBruto * 0.03;
		totalDescontos = valorIR + valorINSS + sindicato;
		salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: (" + valorHora + "*" + horasTrabalhadas + "): R$ " + salarioBruto);
		System.out.println("(-) IR ("+ percentualIR + "%): R$ " + valorIR);
		System.out.println("(-) Sindicato (3%) : R$ " + sindicato);
		System.out.println("(-) INSS (10%) : R$ " + valorINSS);
		System.out.println("(-) FGTS (11%) : R$ " + valorFGTS);
		System.out.println("Total de descontos : R$ " + totalDescontos);
		System.out.println("Salário Liquido : R$ " + salarioLiquido);
	}
}