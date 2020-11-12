/*37. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.*/

package aula19;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        int fatorial = 1;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorA[i] = scan.nextInt();
            for (int j = vetorA[i]; j > 0; j--) {
                fatorial *= j;
            }
            vetorB[i] = fatorial;
            fatorial = 1;
        }

        System.out.println("  \tvetorA\t\tVetorB");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i + 1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i]);
        }
    }
}