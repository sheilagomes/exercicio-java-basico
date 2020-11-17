/*5. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite.*/
package aula24;

import java.text.DecimalFormat;

public class Exercicio05 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,###.##");

        Conta conta = new Conta();
        conta.numero = "15248-5";
        conta.saldo = 234.60;
        conta.status = "Especial";
        conta.limite = 1000.00;

        System.out.println("Conta 1");
        System.out.println("Número: " + conta.numero);
        System.out.println("Saldo: R$ " + df.format(conta.saldo));
        System.out.println("Status: " + conta.status);
        System.out.println("Limite: R$ " + df.format(conta.limite));
    }
}
