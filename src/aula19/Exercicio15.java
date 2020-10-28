/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.*/

package aula19;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor A:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 !=  0) {
                impares += 1;
            } else {
                pares += 1;
            }
        }

        System.out.println((pares*10) + "% dos números são pares e " + (impares*10) + "% são ímpares no vetorA");
    }
}