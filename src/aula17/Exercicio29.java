/*29. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.*/

package aula17;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scan.nextInt();

        boolean primo;

        System.out.println("Números primos entre 1 e " + numero + ":");

        for (int i = 1; i <= numero; i++){

            primo = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    primo = false;
                    break;
                }
            }

            if (primo){
                System.out.println(i);
            }
        }
    }
}
