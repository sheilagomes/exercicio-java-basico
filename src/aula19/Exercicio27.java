/*27. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B i deverá receber 'a' quando A i for menor que 7;
b) B i deverá receber 'b' quando A i for igual a 7;
c) B i deverá receber 'c' quando A i for maior que 7 e menor que 10;
d) B i deverá receber 'd' quando A i for igual a 10; e
e) B i deverá receber 'e' quando A i for maior que 10.
Sugestão: char B[10];*/

package aula19;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
        }

        System.out.println("  \tvetorA\t\tvetorB");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + "\t" + vetorA[i] + "\t\t\t" + vetorB[i]);
        }
    }
}
