/*4. Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

package aula20;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[30][24];
        int opcao = 0;

        while (opcao != 3) {
            while (true) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                 AGENDA                 \nDigite 1 (novo) / 2 (consulta) / 3 (sair)");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    System.out.print("Digite o dia: ");
                    int dia = scan.nextInt();
                    System.out.print("\nDigite a hora: ");
                    int hora = scan.nextInt();
                    System.out.print("\nDigite a tarefa: ");
                    String tarefa = scan.next();
                    agenda[dia][hora] = tarefa;
                } else if (opcao == 2) {
                    System.out.print("Digite o dia: ");
                    int dia = scan.nextInt();
                    System.out.print("\nDigite a hora: ");
                    int hora = scan.nextInt();
                    System.out.println();
                    System.out.println("Dia: " + dia + "\nHora: " + hora + ":00\nTarefa: " + agenda[dia][hora]);
                } else if (opcao == 3) {
                    System.out.println("Saindo!");
                    break;
                } else {
                    System.out.println("Valor inválido! Tente de novo");
                }
            }
        }
    }
}