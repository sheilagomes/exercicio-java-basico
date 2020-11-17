/*1. Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.*/

package aula24;

public class Exercicio01 {
    public static void main(String[] args) {

        Lampada led = new Lampada();
        led.marca = "Queluz";
        led.usos = new String[2];
        led.tipo = "led";
        led.usos[0] = "abajur";
        led.usos[1] = "soquete";
        led.watts = 15;
        led.preco = 9.9;

        System.out.println("Lâmpada 1");
        System.out.println("Marca: " + led.marca);
        System.out.println("Tipo: " + led.tipo);
        System.out.println("Usos: " + led.usos[0] + ", " + led.usos[1]);
        System.out.println("Potência: " + led.watts + "w");
        System.out.println("Preço: R$ " + led.preco);
    }
}
