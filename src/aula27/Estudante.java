/*3. Escreva uma classe para representar um Estudante. Adicione atributos relacionados às caracteristicas de um Estudante, como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o estudante está aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do estudante ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o estudante foi aprovado ou não.*/

package aula27;

public class Estudante {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][4];

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Disciplina: " + disciplinas[i] + "\nNotas: ");
            for (int j = 0; j < 4; j++) {
                System.out.print(notas[i][j] + " ");
            }
            if (aprovado(i)) {
                System.out.print("Aprovado");
            } else {
                System.out.print("Reprovado");
            }
            System.out.println();
            System.out.println();
        }
    }

    boolean aprovado(int indice) {
        if (media(indice) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    double media(int indice) {
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[indice][i];
        }
        double media = soma/4;
        return media;
    }


}
