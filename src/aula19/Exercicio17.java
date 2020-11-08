/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.*/

package aula19;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int total = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "a. pessoa:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] > 35) {
                total += 1;
            }
        }
        System.out.println("Existem " + total +" pessoas com mais de 35 anos no grupo");
    }
}