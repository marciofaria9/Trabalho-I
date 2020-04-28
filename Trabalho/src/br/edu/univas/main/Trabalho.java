package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
				
		do {
			System.out.println("Digite o número da opção desejada: ");
			System.out.println();
			System.out.println("1. Somar");
			System.out.println("2. Subtrair");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("9. Sair");
					
			int escolha = leitura.nextInt();
			
			if (escolha == 1) {
				System.out.println("Digite o primeiro número");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo número");
				float y = leitura.nextFloat();
				
				System.out.println(" A soma de " + x +  " por " + y + " é igual a: " + (x + y) );
				System.out.println();
				
			}
			else if (escolha == 2) {
				System.out.println("Digite o primeiro número");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo número");
				float y = leitura.nextFloat();
				
				System.out.println(" A subtração de " + x +  " por " + y + " é igual a: " + (x - y) );
				System.out.println();
				
			}
			
			else if (escolha == 3) {
				
				System.out.println("Digite o primeiro número");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo número");
				float y = leitura.nextFloat();
				
				System.out.println(" A multiplicação de " + x +  " por " + y + " é igual a: " + (x * y) );
				System.out.println();
													
			}
			
			else if (escolha == 4) {
				System.out.println("Digite o primeiro número");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo número");
				float y = leitura.nextFloat();
				
				System.out.println(" A divisão de " + x +  " por " + y + " é igual a: " + (x / y) );
				System.out.println();
				
			}
			
			else if (escolha == 9 ) {
				break;
			}
			
			else {
				System.out.println("Opção inválida! Por favor, digite uma opção correta!");
				System.out.println();
			}
			
			
		} while (true);
		
		leitura.close();
										
		
		
	}

}
