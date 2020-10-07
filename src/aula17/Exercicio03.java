/*3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';*/

package aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String nome, genero, estadoCivil;
		int idade;
		double salario;
		boolean valido = false;
		
		do {				
			System.out.println("Digite seu nome: (3 caracteres ou mais)");
			nome = scan.next();
			
			if (nome.length() < 3) {
				System.out.println("O nome não pode ter menos de 3 caracteres! Tente de novo.");
			} else {
				valido = true;
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite sua idade: (entre 0 e 150)");
			idade = scan.nextInt();
			
			if (idade < 0 || idade > 150) {
				System.out.println("A idade deve ser de 0 a 150 anos! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu salário: (maior que 0)");
			salario = scan.nextDouble();
			
			if (salario <= 0) {
				System.out.println("O salário deve ser maior que 0! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu gênero: (f/m)");
			genero = scan.next();
			
			if (!genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("m")) {
				System.out.println("O gênero deve ser f ou m! Tente de novo.");
			} else {
				valido = true;
			}
		
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite seu estado civil: (s/c/v/d)");
			estadoCivil = scan.next();
					
			if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("O gênero deve ser s, c, v ou d! Tente de novo.");
			} else {
				valido = true;
			}
			
		} while (!valido);
		
		System.out.println("As informações coletadas não:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Estado Civil: " + estadoCivil);
	}
}