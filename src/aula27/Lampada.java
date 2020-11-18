/*1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.*/
package aula27;

public class Lampada {

    String tipo;
    String[] usos;
    String marca;
    int watts;
    double preco;

    void ligar() {
        System.out.println("A lâmpada está ligada");
    }

    void desligar() {
        System.out.println("A lâmpada está desligada");
    }
}