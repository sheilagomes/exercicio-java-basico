/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
a) a soma de elementos armazenados neste vetor que são inferiores a 15;
b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
c) a média dos elementos armazenados no vetor que são superiores a 15.*/

package aula19;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int menor = 0;
        int igual = 0;
        int media = 0;
        int total = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor:");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 15) {
                menor += vetorA[i];
            }
            if (vetorA[i] == 15) {
                igual += 1;
            }
            if (vetorA[i] > 15) {
                media += vetorA[i];
                total += 1;
            }
        }

        System.out.println("A soma dos números menores que 15 no vetor é " + menor);
        System.out.println("O vetor contém " + igual + " vezes o número 15");
        System.out.println("A média do números maiores que 15 é " + (media / total));

    }
}
