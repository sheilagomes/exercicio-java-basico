/*32. O cardápio de uma lanchonete é o seguinte:
Especificação		Código	Preço
Cachorro Quente	    100	    R$ 1,20
Bauru Simples		101	    R$ 1,30
Bauru com ovo		102	    R$ 1,50
Hambúrguer		    103	    R$ 1,20
Cheeseburguer		104	    R$ 1,30
Refrigerante		105	    R$ 1,00
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.*/

package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valida = false;
        double soma = 0;
        double precoitem = 1;
        String item = "";

        DecimalFormat format = new DecimalFormat("###,###.##");

        do {
            System.out.println("Digite o código do produto (0 para encerrar): ");
            int codigo = scan.nextInt();

            if(codigo == 100) {
                item = "Cachorro Quente";
                precoitem = 1.20;
            } else if (codigo == 101) {
                item = "Bauru Simples";
                precoitem = 1.30;
            } else if (codigo == 102) {
                item = "Bauru com ovo";
                precoitem = 1.50;
            } else if (codigo == 103) {
                item = "Hambúrguer";
                precoitem = 1.20;
            } else if (codigo == 104) {
                item = "Cheeseburguer";
                precoitem = 1.30;
            } else if (codigo == 105) {
                item = "Refrigerante";
                precoitem = 1.00;
            }

            if (codigo == 0) {
                valida = true;
            } else {
                System.out.println("Digite a quantidade: ");
                int qtde = scan.nextInt();
                soma += (precoitem * qtde);
                System.out.println("Item: " + item + " -> " + format.format(precoitem) + " Qtde: " + qtde + " Total: R$ " + format.format(precoitem * qtde));
                valida = false;
            }
        } while (!valida);

        System.out.println("Total a pagar : R$ " + soma);
    }
}