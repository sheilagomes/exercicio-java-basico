/*26. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi;
c) Ci deverá receber -1 quando A i for menor que B i.*/

package aula19;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 100);
            vetorB[i] = (int) Math.round(Math.random() * 100);
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
            }
        }

        System.out.println("  \tvetorA\tvetorB\tvetorC");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + "\t" + vetorA[i] + "\t\t" + vetorB[i] + "\t\t" + vetorC[i]);
        }
    }
}
