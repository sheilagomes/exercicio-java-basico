/*3. Usando o resultado do exercício anterior como base, crie uma classe “LivroDeLivraria” que represente os dados básicos de um livro que está à venda em uma livraria.*/

package aula24;

public class Exercicio03 {
    public static void main(String[] args) {

        LivroDeLivraria livrodeLivraria = new LivroDeLivraria();
        livrodeLivraria.nome = "A floresta sombria";
        livrodeLivraria.autor = new String[1];
        livrodeLivraria.autor[0] = "Cixin Liu";
        livrodeLivraria.editora = "Intrínseca";
        livrodeLivraria.numPag = 900;
        livrodeLivraria.isbn = "9781427273321";
        livrodeLivraria.preco = 89;

        System.out.println("Livro 1");
        System.out.println("Nome: " + livrodeLivraria.nome);
        System.out.println("Autor(es): " + livrodeLivraria.autor[0]);
        System.out.println("Editora: " + livrodeLivraria.editora);
        System.out.println("Número de páginas: " + livrodeLivraria.numPag);
        System.out.println("ISBN: " + livrodeLivraria.isbn);
        System.out.println("Preço: R$ " + livrodeLivraria.preco);

    }
}
