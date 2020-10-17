/*25. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00*/

package aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		boolean fechar = false;
		double soma = 0;
		int numero = 0;

		do {			
			//número desconhecido de valores, zero indica o final da compra
			do {
				System.out.println("Digite o valor do produto: ");
				double preco = scan.nextDouble();
				soma += preco;
				numero += 1;
				if (preco == 0) {
					valida = true;
				} else {
					System.out.println("Produto " + numero + ": 	R$ " + preco);
					valida = false;
				}
			} while (!valida);
			//mostrar o total da compra
			System.out.println("Total:		R$ " + soma);
			//perguntar o valor em dinheiro pago
			System.out.println("Digite o valor pago em dinheiro: R$ ");
			double pago = scan.nextDouble();
			System.out.println("Dinheiro:	R$ " + pago);
			//calcular e mostrar o valor do troco
			System.out.println("Troco: 		R$ " + (pago-soma));
		//voltar ao ponto inicial, para registrar a próxima compra
			System.out.println("Próxima compra? (S/N)");
			String proxima = scan.next();
			if (proxima.equalsIgnoreCase("s")) {
				fechar = false;
				soma = 0;
				numero = 0;
			} else {
				fechar = true;
			}
		} while (!fechar);
	}
}