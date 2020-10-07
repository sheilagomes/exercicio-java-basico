/*14.Faça um programa que peça o tamanho de um arquivo para download (em MB)
 * e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
 * aproximado de download do arquivo usando este link (em minutos).*/

package aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanho = scan.nextDouble();
		System.out.println("Digite a velocidade do link de Internet em Mbps: ");
		double velocidade = scan.nextDouble();
		double tempoDownload = tamanho / velocidade;
		System.out.println("O tempo aproximado de download do arquivo é de " + tempoDownload + " minutos.");
	}
}
