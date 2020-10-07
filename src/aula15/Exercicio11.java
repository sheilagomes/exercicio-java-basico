/*11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
* salários até R$ 280,00 (incluindo): aumento de 20%
* salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
* salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
* salários de R$ 1500,00 em diante : aumento de 5%
Após o aumento ser realizado, informe na tela:
* o salário antes do reajuste;
* o percentual de aumento aplicado;
* o valor do aumento;
* o novo salário, após o aumento.*/

package aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double salario, percentual, aumento, novoSalario;
		
		System.out.println("Digite o salário do funcionário: ");
		salario = scan.nextDouble();
		percentual = 0;
		
		if (salario <= 280) { 
			percentual = 20;
		} else if (salario > 280 && salario <= 700) {
			percentual = 15;
		} else if (salario >700 && salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}
		
		aumento = salario * (percentual/100);
		novoSalario = salario + aumento;
		
		System.out.println("O salário antes do reajuste era " + salario + " reais");
		System.out.println("O percentual de aumento aplicado foi " + percentual + "%"); 
		System.out.println("O valor do aumento foi de " + aumento + " reais"); 
		System.out.println("O novo salário, após o aumento, é " + novoSalario + " reais");
	}
}