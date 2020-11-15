/*2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.*/

package aula20;

public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int maior = 0;
        int menor;
        System.out.println("Col\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        System.out.println("Lin");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(matrizM[i][j] + "\t");
            }
            System.out.println();
        }

        menor = matrizM[5][0];
        for (int i = 0; i < 10; i++) {
            if (matrizM[5][i] >= maior) {
                maior = matrizM[5][i];
            }
            if (matrizM[5][i] <= menor) {
                menor = matrizM[5][i];
            }
        }

        System.out.println("\nO menor número da linha 5 é " + menor + " e o maior é " + maior);

        maior = 0;
        menor = matrizM[7][0];

        for (int i = 0; i < 10; i++) {
            if (matrizM[7][i] >= maior) {
                maior = matrizM[7][i];
            }
            if (matrizM[7][i] <= menor) {
                menor = matrizM[7][i];
            }
        }

        System.out.println("\nO menor número da linha 7 é " + menor + " e o maior é " + maior);

    }
}
