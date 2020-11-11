/*19. Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.*/

package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Result = new double[10];

        for (int i = 0; i < Nota1.length; i++) {
            System.out.println("Digite a 1a. nota do " + (i+1) + " aluno");
            Nota1[i] = scan.nextDouble();
            System.out.println("Digite a 2a. nota do " + (i+1) + " aluno");
            Nota2[i] = scan.nextDouble();
            Result[i] = (Nota1[i] + Nota2[i])/2;
        }

        DecimalFormat df = new DecimalFormat("##.#");
        System.out.println("\t\t\tNota 1\t\tNota2\t\tMédia\t\tResultado");

        for (int i = 0; i < Nota1.length; i++) {
            if (Result[i] >= 7) {
                System.out.println("Aluno " + (i+1) + "\t\t" + Nota1[i] + "\t\t" + Nota2[i] + "\t\t" + df.format(Result[i]) +"\t\tAprovado");
            } else {
                System.out.println("Aluno " + (i+1) + "\t\t" + Nota1[i] + "\t\t" + Nota2[i] + "\t\t" + df.format(Result[i]) + "\t\tReprovado");
            }
        }
    }
}
