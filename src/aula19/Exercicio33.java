/*33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.*/

package aula19;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean primo;

        for (int i = 0; i < vetorA.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorA[i] = scan.nextInt();*/
            vetorA[i] = (int) Math.round(Math.random() * 100);
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("O número " + vetorA[i] + " é primo");
            } else {
                System.out.println("O número " + vetorA[i] + " não é primo");
            }
        }
    }
}