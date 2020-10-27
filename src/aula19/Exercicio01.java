/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].*/

package aula19;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite o número na posição " + (i+1) + " do vetor A:");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetores\nA - B");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println(vetorA[i] + "   " + vetorB[i]);
        }
    }
}