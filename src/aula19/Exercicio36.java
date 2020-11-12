/*36. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2 i . Sugestão int A[11];*/

package aula19;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.pow(2,i);
        }

        System.out.println("\tElemento");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(i + "\t" + vetorA[i]);
        }
    }
}
