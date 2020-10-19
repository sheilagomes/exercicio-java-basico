/*27. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.*/

package aula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		//ler um conjunto indeterminado de temperaturas
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas temperaturas?");
        int qtTemp = scan.nextInt();
        
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
				
		for (int i = 1; i <= qtTemp; i++){
            
            System.out.println("Digite a temperatura " + i + ":");
            temp = scan.nextDouble();
            
            soma += temp;
            
            if (temp > maior){
                maior = temp;
            }
            
            if (temp < menor){
                menor = temp;
            }
        }
		//informar ao final a menor, maior e a média
		System.out.println("A maior temperatura é " + maior);
		System.out.println("A menor temperatura é " + menor);
		System.out.println("A média é " + (soma/qtTemp));

	}

}