/*23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir este propósito.*/

package aula19;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int marcador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + "o. número do vetor");
            vetorA[i] = scan.nextInt();;
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                marcador += 1;
            }  else {
                break;
            }
        }

        if (marcador == vetorA.length) {
            System.out.println("Todos os elementos do vetor são pares");
        } else {
            System.out.println("O vetor tem pelo menos 1 elemento ímpar");
        }
    }
}
