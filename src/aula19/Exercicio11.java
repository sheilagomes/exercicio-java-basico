/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares.*/

package aula19;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int total = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor A:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 ==  0) {
                total += 1;
            }
        }

        System.out.println("O vetorA tem " + total + " números pares");
    }
}
