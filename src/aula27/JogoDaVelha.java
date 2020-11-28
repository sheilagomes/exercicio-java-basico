/*4. Desenvolva uma classe para representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo.*/

package aula27;

public class JogoDaVelha {

    char[][] matrizM = new char[3][3];

    void inicializarJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizM[i][j] = ' ';
            }
        }
    }

    boolean preencher(int linha, int coluna, char simbolo) {
        if (matrizM[linha - 1][coluna - 1] == ' ') {
            matrizM[linha - 1][coluna - 1] = simbolo;
            return false;
        } else {
            System.out.println("Já preenchida, tente de novo");
        }
        return true;
    }

    void imprimirTabuleiro() {
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
    }

    boolean verificarGanhador(int linha, int coluna) {
        if ((matrizM[0][0] == (matrizM[linha-1][coluna-1]) && matrizM[0][0] == (matrizM[0][1]) && matrizM[0][1] == (matrizM[0][2])) ||
        (matrizM[1][0] == (matrizM[linha-1][coluna-1]) && matrizM[1][0] == (matrizM[1][1]) && matrizM[1][1] == (matrizM[1][2])) ||
                (matrizM[2][0] == (matrizM[linha-1][coluna-1]) && matrizM[2][0] == (matrizM[2][1]) && matrizM[2][1] == (matrizM[2][2])) ||
                (matrizM[0][0] == (matrizM[linha-1][coluna-1]) && matrizM[0][0] == (matrizM[1][0]) && matrizM[1][0] == (matrizM[2][0])) ||
                (matrizM[0][1] == (matrizM[linha-1][coluna-1]) && matrizM[0][1] == (matrizM[1][1]) && matrizM[1][1] == (matrizM[2][1])) ||
                (matrizM[0][2] == (matrizM[linha-1][coluna-1]) && matrizM[0][2] == (matrizM[1][2]) && matrizM[1][2] == (matrizM[2][2])) ||
                (matrizM[0][0] == (matrizM[linha-1][coluna-1]) && matrizM[0][0] == (matrizM[1][1]) && matrizM[1][1] == (matrizM[2][2])) ||
        (matrizM[0][2] == (matrizM[linha-1][coluna-1]) && matrizM[0][2] == (matrizM[1][1]) && matrizM[1][1] == (matrizM[2][0]))) {
            System.out.println("\nO jogador " + matrizM[linha - 1][coluna - 1] + " ganhou\nFIM DE JOGO!");
            return true;
        }
        return false;
    }

    boolean jogada(int contador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(matrizM[i][j] == ' ')) {
                    contador++;
                }
            }
        }
        if (contador == 9) {
            return true;
        }
        return false;
    }

    char trocaJogador(char simbolo) {
        if (simbolo == 'O') {
            return 'X';
        } else {
            return 'O';
        }
    }
}