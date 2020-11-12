/*35. Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.*/

package aula19;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorA[i] = scan.nextInt();*/
            vetorA[i] = (int) Math.round(Math.random() * 100);
            System.out.println("Elemento " + (i+1) + " - " + vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}