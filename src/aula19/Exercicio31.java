/*31. Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.*/

package aula19;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int contPar = 0;
        int contImpar = 10;

        for (int i = 0; i < vetorA.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorA[i] = scan.nextInt();*/
            vetorA[i] = (int) Math.round(Math.random() * 100);
            if (vetorA[i] % 2 == 0 && contPar < 10) {
                vetorB[contPar] = vetorA[i];
                contPar++;
            } else if (vetorA[i] % 2 != 0 && contImpar >= 10) {
                vetorB[contImpar] = vetorA[i];
                contImpar++;
            }
        }

        System.out.println("  \tvetorA\t\tVetorB");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i + 1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i]);
        }
    }
}