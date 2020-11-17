/*6. Crie uma classe que represente um contato da agenda do seu celular.*/
package aula24;

public class Exercicio06 {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.nome = "Marcos Gomes";
        contato.telefones = new String[1];
        contato.telefones[0] = "47999887766";
        contato.contas = new String[2];
        contato.contas[0] = "Google";
        contato.contas[1] = "Whatsapp";
        contato.email = "marcosgomes@gmail.com";
        contato.endereco = "Jaraguá do Sul";

        System.out.println("Contato 1");
        System.out.println("Nome: " + contato.nome);
        System.out.println("Telefone(s): " + contato.telefones[0]);
        System.out.println("Conta(s): " + contato.contas[0] + ", " + contato.contas[1]);
        System.out.println("E-mail: " + contato.email);
        System.out.println("Endereço: " + contato.endereco);
    }
}
