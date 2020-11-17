/*4. Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” que represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.*/

package aula24;

import java.util.Date;

public class Exercicio04 {
    public static void main(String[] args) {

        LivroDeBiblioteca livro1 = new LivroDeBiblioteca();
        livro1.nome = "O fim da morte";
        livro1.autor = new String[1];
        livro1.autor[0] = "Cixin Liu";
        livro1.editora = "Intrínseca";
        livro1.isbn = "9781427273322";
        livro1.numPag = 800;
        livro1.emprestado = true;
        livro1.emprestadoA = "Maria Soares";
        livro1.dataEntrega = new Date();

        System.out.println("Livro 1");
        System.out.println("Nome: " + livro1.nome);
        System.out.println("Autor: " + livro1.autor[0]);
        System.out.println("Editora: " + livro1.editora);
        System.out.println("ISBN: " + livro1.isbn);
        System.out.println("Número de páginas: " + livro1.numPag);
        if (livro1.emprestado) {
            System.out.println("Emprestado: Sim");
            System.out.println("A: " + livro1.emprestadoA);
            System.out.println("Data de entrega: " + livro1.dataEntrega);
        } else {
            System.out.println("Emprestado: Não");
        }

        LivroDeBiblioteca livro2 = new LivroDeBiblioteca();
        livro2.nome = "O fim da morte";
        livro2.autor = new String[1];
        livro2.autor[0] = "Cixin Liu";
        livro2.editora = "Intrínseca";
        livro2.isbn = "9781427273322";
        livro2.numPag = 800;
        livro2.emprestado = false;
        livro2.emprestadoA = "Maria Soares";
        livro2.dataEntrega = new Date();

        System.out.println();

        System.out.println("Livro 2");
        System.out.println("Nome: " + livro2.nome);
        System.out.println("Autor: " + livro2.autor[0]);
        System.out.println("Editora: " + livro2.editora);
        System.out.println("ISBN: " + livro2.isbn);
        System.out.println("Número de páginas: " + livro2.numPag);
        if (livro2.emprestado) {
            System.out.println("Emprestado: Sim");
            System.out.println("A: " + livro2.emprestadoA);
            System.out.println("Data de entrega: " + livro2.dataEntrega);
        } else {
            System.out.println("Emprestado: Não");
        }

    }
}
