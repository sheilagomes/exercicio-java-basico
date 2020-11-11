/*24. Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.*/

package aula19;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int marcador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. valor");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == vetorA[(vetorA.length-1)-i]) {
                marcador += 1;
            }
        }

        if (marcador == vetorA.length) {
            System.out.println("O vetor forma um palíndromo");
        } else {
            System.out.println("O vetor não forma um palíndromo");
        }
    }
}
