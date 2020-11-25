/*2. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.*/
package aula27;

import java.text.DecimalFormat;

public class Exercicio02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###,###.##");

        Conta conta = new Conta();
        conta.numero = "15248-5";
        conta.agencia = "301-7";
        conta.saldo = 234.60;
        conta.especial = true;
        conta.limiteEspecial = 1000.00;

        System.out.println("Conta 1");
        System.out.println("Número: " + conta.numero);
        System.out.println("Número: " + conta.agencia);
        System.out.println("Saldo: R$ " + df.format(conta.saldo));
        if (conta.especial) {
            System.out.println("O status da conta é Especial");
        }
        System.out.println("Limite: R$ " + df.format(conta.limiteEspecial));

        conta.realizarSaque(50);
        conta.despositarDinheiro(34);
        conta.consultarSaldo();
        conta.usaChequeEspecial();
    }
}
