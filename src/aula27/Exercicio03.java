/*3. Escreva uma classe para representar um Estudante. Adicione atributos relacionados às caracteristicas de um Estudante, como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o estudante está aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do estudante ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o estudante foi aprovado ou não.*/

package aula27;

public class Exercicio03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Célio Santos";
        estudante.matricula = 123456;
        estudante.curso = "BD";
        estudante.disciplinas = new String[3];
        estudante.disciplinas[0] = "Introdução a BD";
        estudante.disciplinas[1] = "Administração de BD";
        estudante.disciplinas[2] = "Tópicos avançados de BD";
        estudante.notas = new double[3][4];
        estudante.notas[0][0] = 10;
        estudante.notas[0][1] = 9.8;
        estudante.notas[0][2] = 8.5;
        estudante.notas[0][3] = 10;
        estudante.notas[1][0] = 5;
        estudante.notas[1][1] = 7.8;
        estudante.notas[1][2] = 4.5;
        estudante.notas[1][3] = 6;
        estudante.notas[2][0] = 9.8;
        estudante.notas[2][1] = 9;
        estudante.notas[2][2] = 8.5;
        estudante.notas[2][3] = 8;

        estudante.mostrarDados();
    }
}
