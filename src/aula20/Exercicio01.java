/*1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o maior número da matriz e a sua posição (linha, coluna).*/

package aula20;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) Math.round(Math.random() * 100);
                System.out.println("Elemento[" + i + "][" + j +"] - " +  matrizA[i][j]);
                if (matrizA[i][j] > maior) {
                  maior = matrizA[i][j];
                  linha = i;
                  coluna = j;
                }
            }
        }

        System.out.println("O maior número é " + maior + " e está na linha " + linha + " e coluna " + coluna );
    }
}
