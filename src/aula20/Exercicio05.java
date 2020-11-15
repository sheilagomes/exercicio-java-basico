/*5. Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).*/

package aula20;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] agenda = new String[12][30][8];
        int opcao = 0;

        while (opcao != 3) {
            while (true) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                 AGENDA                 \nDigite 1 (novo) / 2 (consulta) / 3 (sair)");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    System.out.print("Digite o mês (de 1 a 12): ");
                    int mes = scan.nextInt();
                    System.out.print("\nDigite o dia (de 1 a 30): ");
                    int dia = scan.nextInt();
                    System.out.print("\nDigite a hora (das 9 às 16): ");
                    int hora = scan.nextInt();
                    System.out.print("\nDigite a tarefa: ");
                    String tarefa = scan.next();
                    agenda[mes-1][dia-1][hora-9] = tarefa;
                } else if (opcao == 2) {
                    System.out.print("Digite o mês (de 1 a 12): ");
                    int mes = scan.nextInt();
                    System.out.print("\nDigite o dia (de 1 a 30): ");
                    int dia = scan.nextInt();
                    System.out.print("\nDigite a hora (das 9 às 16): ");
                    int hora = scan.nextInt();
                    System.out.println();
                    System.out.println("Mês: " + mes + "\nDia: " + dia + "\nHora: " + hora + ":00\nTarefa: " + agenda[mes-1][dia-1][hora-9]);
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