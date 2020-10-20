/*34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.*/

package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double soma = 0;

        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.println("Digite o número de termos da série:");
        int termos = scan.nextInt();

        for (double i = 1; i <= termos ; i++) {
            soma += (1 / i);
        }

        System.out.println("A soma da série é " + format.format(soma));
    }
}