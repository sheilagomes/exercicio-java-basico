/*32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.*/

package aula19;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número");
            vetorA[i] = scan.nextInt();
        }
        for (int k : vetorA) {
            System.out.println("Tabuada de " + k);
            for (int j = 1; j <= 10; j++) {
                System.out.println(k + " X " + j + " = " + (k * j));
            }
        }
    }
}