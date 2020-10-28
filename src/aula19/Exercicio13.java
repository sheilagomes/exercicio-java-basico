/*13. Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.*/

package aula19;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int total = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor A:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 5 ==  0) {
                total += vetorA[i];
            }
        }

        System.out.println("A soma dos múltiplos de 5 no" +
                " vetorA é " + total);
    }
}