/*4. Desenvolva uma classe para representar o Jogo da Velha. Desenvolva uma classe para testar o Jogo.*/

package aula27;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        int linha = 0;
        int coluna = 0;
        char simbolo = 'O';
        boolean valida = true;
        boolean vvalida = true;
        int contador = 0;

        jogoDaVelha.inicializarJogo();

        while (valida) {
            jogoDaVelha.imprimirTabuleiro();
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
                vvalida = jogoDaVelha.preencher(linha, coluna, simbolo);
            }

            if (jogoDaVelha.verificarGanhador(linha, coluna)){
                valida = false;
            }

            simbolo = jogoDaVelha.trocaJogador(simbolo);
            vvalida = true;

            if (jogoDaVelha.jogada(contador)) {
                System.out.println("FIM DO JOGO!");
                valida = false;
            }
        }
    }
}