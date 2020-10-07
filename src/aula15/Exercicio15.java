/*15.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
é: equilátero, isósceles ou escaleno.
Dicas:
* Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que
  o terceiro;
* Triângulo Equilátero: três lados iguais;
* Triângulo Isósceles: quaisquer dois lados iguais;
* Triângulo Escaleno: três lados diferentes;*/

package aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três medidas para ver se elas formam um triângulo");
		System.out.println("Digite a primeira medida:");
		int medida1 = scan.nextInt();
		
		System.out.println("Digite a segunda medida:");
		int medida2 = scan.nextInt();
		
		System.out.println("Digite a terceira medida:");
		int medida3 = scan.nextInt();
		
		if (medida1 + medida2 > medida3 || medida2 + medida3 > medida1 || medida1 + medida3 > medida2) {
			if (medida1 == medida2 && medida2 == medida3) {
				System.out.println("O triângulo é equilátero");
			} else if (medida1 != medida2 && medida2 != medida3) {
				System.out.println("O triângulo é escaleno");
			} else {
				System.out.println("O triângulo é isósceles");
			}
		} else {
			System.out.println("Essas medidas não formam um triângulo");
		}
	}
}
