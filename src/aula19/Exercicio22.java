/*22. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.*/

package aula19;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int qt0 = 0;
        int qt1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 1);
            System.out.println("Elemento " + (i+1) + " - " + vetorA[i]);
            if (vetorA[i] == 0) {
                qt0 += 1;
            } else {
                qt1 += 1;
            }
        }
        System.out.println("Existem " + qt0*10 + "% de zeros e " + qt1*10 + "% de uns no vetorA");
    }
}
