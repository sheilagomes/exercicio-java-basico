/*2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.*/

package aula19;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite o número na posição " + (i+1) + " do vetor A:");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetores\nA - B");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println(vetorA[i] + "   " + vetorB[i]);
        }
    }
}
