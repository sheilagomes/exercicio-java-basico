package aula19;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "a. pessoa:");
            vetorA[i] = scan.nextInt();
        }

        int menor = vetorA[0];
        int maior = vetorA[0];
        int posiMaior = 0;
        int posiMenor = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > maior){
                maior = vetorA[i];
                posiMaior = i;
            } else if (vetorA[i] < menor){
                menor = vetorA[i];
                posiMenor = i;
            }
        }
        System.out.println("A maior idade é " + maior +" na posição " + posiMaior + " e a menor é " + menor + " na posição " + posiMenor);
    }
}