/*14. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.*/

package aula19;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int total = 0;
        int num = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor A:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 !=  0) {
                total += vetorA[i];
                num += 1;
            }
        }

        System.out.println("Existem " + num + " números ímpares no vetorA");
        System.out.println("A soma deles é " + total);
        System.out.println("A média deles é " + total/num);
    }
}