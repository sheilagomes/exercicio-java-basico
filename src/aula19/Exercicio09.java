/*9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).*/

package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite o número na posição " + (i+1) + " do vetor A:");
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o número na posição " + (i+1) + " do vetor B:");
            vetorB[i] = scan.nextInt();
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetores\t\tA\tB\tC");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Índice " + i + ":\t" + vetorA[i] + "\t" + vetorB[i] + "\t" + df.format(vetorC[i]));
        }
    }
}