/*6. Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.*/

package aula20;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] matrizM = new String[3][3];
        int linha = 0;
        int coluna = 0;
        String simbolo = "O";
        boolean valida = true;
        boolean vvalida = true;
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizM[i][j] = " ";
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("JOGO DA VELHA - Jogador1 = O   Jogador2 = X");
        System.out.println("-------------------------------------------");
        System.out.println("Col\t1\t2\t3");
        System.out.println("Lin");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizM[i][j] + "\t");
            }
            System.out.println();
        }
        while (valida) {
            while (vvalida) {
                System.out.println("\n------------------");
                System.out.println("Jogador atual: " + simbolo);
                System.out.println("Digite a linha");
                linha = scan.nextInt();
                while (linha > 3 || linha < 0) {
                    System.out.println("Valor inválido! Tente de novo:");
                    linha = scan.nextInt();
                }
                System.out.println("Digite a coluna");
                coluna = scan.nextInt();
                while (coluna > 3 || coluna < 0) {
                    System.out.println("Valor inválido! Tente de novo:");
                    coluna = scan.nextInt();
                }
                if (matrizM[linha - 1][coluna - 1].equals(" ")) {
                    matrizM[linha - 1][coluna - 1] = simbolo;
                    vvalida = false;
                } else {
                    System.out.println("Já preenchida, tente de novo");
                }
            }
            System.out.println("-------------------------------------------");
            System.out.println("JOGO DA VELHA - Jogador1 = O   Jogador2 = X");
            System.out.println("-------------------------------------------");
            System.out.println("Col\t1\t2\t3");
            System.out.println("Lin");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "\t");
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizM[i][j] + "\t");
                }
                System.out.println();
            }

            if (matrizM[0][0].equals(matrizM[linha-1][coluna-1]) && matrizM[0][0].equals(matrizM[0][1]) && matrizM[0][1].equals(matrizM[0][2])) {
                System.out.println("\nO jogador " + matrizM[linha-1][coluna-1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[1][0].equals(matrizM[linha-1][coluna-1]) && matrizM[1][0].equals(matrizM[1][1]) && matrizM[1][1].equals(matrizM[1][2])) {
                System.out.println("\nO jogador " + matrizM[linha-1][coluna-1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[2][0].equals(matrizM[linha-1][coluna-1]) && matrizM[2][0].equals(matrizM[2][1]) && matrizM[2][1].equals(matrizM[2][2])) {
                System.out.println("\nO jogador " + matrizM[linha-1][coluna-1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[0][0].equals(matrizM[linha-1][coluna-1]) && matrizM[0][0].equals(matrizM[1][0]) && matrizM[1][0].equals(matrizM[2][0])) {
                System.out.println("\nO jogador " + matrizM[linha-1][coluna-1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[0][1].equals(matrizM[linha-1][coluna-1]) && matrizM[0][1].equals(matrizM[1][1]) && matrizM[1][1].equals(matrizM[2][1])) {
                System.out.println("\nO jogador " + matrizM[linha-1][coluna-1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[0][2].equals(matrizM[linha-1][coluna-1]) && matrizM[0][2].equals(matrizM[1][2]) && matrizM[1][2].equals(matrizM[2][2])) {
                System.out.println("\nO jogador " + matrizM[linha - 1][coluna - 1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[0][0].equals(matrizM[linha-1][coluna-1]) && matrizM[0][0].equals(matrizM[1][1]) && matrizM[1][1].equals(matrizM[2][2])) {
                System.out.println("\nO jogador " + matrizM[linha - 1][coluna - 1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            } else if (matrizM[0][2].equals(matrizM[linha-1][coluna-1]) && matrizM[0][2].equals(matrizM[1][1]) && matrizM[1][1].equals(matrizM[2][0])) {
                System.out.println("\nO jogador " + matrizM[linha - 1][coluna - 1] + " ganhou\nFIM DE JOGO!");
                valida = false;
            }

            if (simbolo.equals("O")) {
                simbolo = "X";
            } else if (simbolo.equals("X")) {
                simbolo = "O";
            }
            vvalida = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!matrizM[i][j].equals(" ")) {
                        contador++;
                    }
                }
            }

            if (contador == 9) {
                System.out.println("FIM DO JOGO!");
                valida = false;
            }
        }
    }
}
