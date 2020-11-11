/*29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

package aula19;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor A");
            vetorA[i] = scan.nextInt();*/
            vetorA[i] = (int) Math.round(Math.random() * 100);
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            /*System.out.println("Digite o " + (i+1) + "o. número do vetor B");
            vetorB[i] = scan.nextInt();*/
            vetorB[i] = (int) Math.round(Math.random() * 100);
            vetorC[i+10] = vetorB[i];
        }

        System.out.println("  \tvetorA\t\tvetorB\t\tvetorC");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i] + "\t\t\t" + vetorC[i]);
        }
        for (int i = 10; i < vetorC.length; i++) {
            System.out.println((i+1) + "\t\t\t\t\t\t\t" + vetorC[i]);
        }
    }
}
