/*1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.*/
package aula27;

public class Exercicio01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "Marac1";
        lampada.tipo = "Halógena";
        lampada.usos = new String[2];
        lampada.usos[0] = "Abajur";
        lampada.usos[1] = "Pendente";
        lampada.watts = 90;
        lampada.preco = 39.99;

        lampada.ligar();
        lampada.desligar();
    }
}
