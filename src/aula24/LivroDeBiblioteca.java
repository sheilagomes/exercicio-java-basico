/*4. Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” que represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado a leitores.*/

package aula24;

import java.util.Date;

public class LivroDeBiblioteca {

    String nome;
    String[] autor;
    String editora;
    int numPag;
    String isbn;
    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;
}
