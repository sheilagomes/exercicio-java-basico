/*28. Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com os mesmos elementos de A, sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/

package aula19;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número");
            vetorA[i] = scan.nextInt();
            vetorB[(vetorA.length-1)-i] = vetorA[i];
        }
        System.out.println("  \tvetorA\t\tvetorB");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i]);
        }
    }
}