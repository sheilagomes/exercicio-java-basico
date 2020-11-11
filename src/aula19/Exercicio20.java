/*20. Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.*/

package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[20];
        System.out.println("Digite a cotação do dólar em relação ao real:");
        double dolar = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("###,###.##");
        for (int i = 0; i < (vetorA.length); i++) {
            vetorA[i] = dolar * (i+1);
            if (i == 0) {
                System.out.println((i+1) + " dólar - " + df.format(vetorA[i]) + " reais");
            } else {
                System.out.println((i+1) + " dólares - " + df.format(vetorA[i]) + " reais");
            }
        }

    }
}