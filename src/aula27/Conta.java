/*2. Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar essa classe.*/
package aula27;

import java.text.DecimalFormat;

public class Conta {

    String numero;
    String agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;

    DecimalFormat df = new DecimalFormat("###,###.##");

    boolean realizarSaque(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("SAQUE:\nValor:\t\tR$ " + df.format(valorSaque) + "-\nSaldo:\t\tR$ " + df.format(saldo));
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= valorSaque) {
                    saldo -= valorSaque;
                    System.out.println("SAQUE:\nValor:\t\tR$ " + df.format(valorSaque) + "-\nSaldo:\t\tR$ " + df.format(saldo));
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Não há saldo suficiente");
                return false;
            }
        }
    }

    void despositarDinheiro(double dinheiro) {
        saldo += dinheiro;
        System.out.println("DEPÓSITO:\nValor:\t\tR$ " + df.format(dinheiro) + "+\nSaldo:\t\tR$ " + df.format(saldo));
    }

    void consultarSaldo() {
        System.out.println("CONSULTA:\nSaldo:\t\tR$ " + df.format(saldo));
    }

    boolean usaChequeEspecial() {
        return saldo < 0;
    }
}
