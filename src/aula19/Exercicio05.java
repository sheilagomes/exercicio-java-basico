/*5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.*/

package aula19;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite o número na posição " + (i+1) + " do vetor A:");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Vetores\t\tA\tB");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Índice " + i + ":\t" + vetorA[i] + "\t" + vetorB[i]);
        }
    }
}