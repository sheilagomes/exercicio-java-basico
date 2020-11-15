/*3. Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números ímpares.*/

package aula20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o " + (j+1) + "o. número da linha " + (i+1));
                matrizM[i][j] = scan.nextInt();
                if (matrizM[i][j] % 2 == 0) {
                    pares ++;
                } else {
                    impares ++;
                }
            }
        }

        System.out.println("Col\t1\t2\t3");
        System.out.println("Lin");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizM[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("A matriz tem " + pares + " números pares e " + impares + " números ímpares");

    }
}
