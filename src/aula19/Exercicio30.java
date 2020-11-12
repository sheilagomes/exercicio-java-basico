/*30. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.*/

package aula19;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int contVB = 0;
        int contVC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorA[i] = scan.nextInt();*/
            vetorA[i] = (int) Math.round(Math.random() * 100);
            if (vetorA[i] % 2 == 0 && contVB < 10) {
                vetorB[contVB] = vetorA[i];
                contVB++;
            } else if (vetorA[i] % 2 != 0 && contVC < 10) {
                vetorC[contVC] = vetorA[i];
                contVC++;
            }
        }

        System.out.println("  \tvetorA\t\tPares\t\tÍmpares");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println((i + 1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i] + "\t\t\t" + vetorC[i]);
        }
        for (int i = 10; i < vetorA.length; i++) {
            System.out.println((i + 1) + "\t" + vetorA[i]);
        }
    }
}
