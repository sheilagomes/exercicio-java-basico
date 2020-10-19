/*31. Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.*/

package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário inicial:");
        double salario = scan.nextDouble();

        double aumento = 1.5;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1996; i <=2020 ; i++) {
            salario += (salario * (aumento/100));
            System.out.println("O salário em " + i + " foi de R$ " + format.format(salario) + " e o aumento foi de " + aumento + "%");
            aumento *= 2;
        }

    }
}