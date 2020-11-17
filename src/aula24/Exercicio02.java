/*2. Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.*/

package aula24;

public class Exercicio02 {
    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "O problema dos três corpos";
        livro.autor = new String[1];
        livro.autor[0] = "Cixin Liu";
        livro.editora = "Intrínseca";
        livro.numPag = 700;
        livro.isbn = "9780765377067";

        System.out.println(livro.nome);
        System.out.println(livro.autor[0]);
        System.out.println(livro.editora);
        System.out.println(livro.numPag);
        System.out.println(livro.isbn);
    }
}
