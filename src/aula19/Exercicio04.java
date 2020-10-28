/*4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja:B[i] = sqrt(A[i]).
 */

package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite o número na posição " + (i+1) + " do vetor A:");
            vetorA[i] = scan.nextInt();
            vetorB[i] = sqrt(vetorA[i]);
        }

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetores\t\tA\tB");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Índice " + i + ":\t" + vetorA[i] + "\t" + df.format(vetorB[i]));
        }
    }
}