/*28. Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.*/

package aula17;

public class Exercicio28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
        int qtTemp = scan.nextInt();

		
		numero = int(input('Digite um número inteiro positivo: '))
				cont, primo = 2, True
				while cont < numero:
				    if numero % cont == 0:
				        primo = False;
				    cont = cont + 1
				if (primo):
				    print(f'O número {numero} é primo')
				else:
				    print(f'O número {numero} não é primo')

	}

}
