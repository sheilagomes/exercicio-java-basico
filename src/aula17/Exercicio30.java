/*30. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:
Montar a tabuada de: 5
Começar por: 4
Terminar em: 7
Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.*/

package aula17;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numini, numfin;
        boolean valida = false;

        System.out.println("Digite o número da tabuada:");
        int tabuada = scan.nextInt();

        do {
            System.out.println("Digite o número inicial:");
            numini = scan.nextInt();

            System.out.println("Digite o número final:");
            numfin = scan.nextInt();

            if (numfin > numini) {
                valida = true;
            } else {
                System.out.println("O número final deve ser maior que o inicial, tente de novo");
                System.out.println();
            }
        } while (!valida);

        System.out.println("Montar a tabuada de: " + tabuada);
        System.out.println("Começar por: " + numini);
        System.out.println("Terminar em: " + numfin);
        System.out.println("Vou montar a tabuada de " + tabuada + " começando em " + numini + " e terminando em " + numfin + ":");

        for (int i = numini; i <= numfin; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}