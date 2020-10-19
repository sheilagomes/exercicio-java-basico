/*33. Faça um programa que mostre os n termos da Série a seguir:
S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
Imprima no final a soma da série.*/

package aula17;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0;
        double j = 1;

        System.out.println("Digite o número de termos da série:");
        int termos = scan.nextInt();

        for (int i = 1; i <= termos ; i++) {
            soma += (i / j);
            j += 2;
            System.out.println(i);
            System.out.println(j);
        }
    }
}
