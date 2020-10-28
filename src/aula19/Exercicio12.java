/*12. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.*/

package aula19;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int total = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor A:");
            vetorA[i] = scan.nextInt();
            total += vetorA[i];
        }

        System.out.println("A soma dos elementos do vetorA é " + total);
    }
}