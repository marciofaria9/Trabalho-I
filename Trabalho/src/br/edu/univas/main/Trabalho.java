package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
				
		do {
			System.out.println("Digite o n�mero da op��o desejada: ");
			System.out.println();
			System.out.println("1. Somar");
			System.out.println("2. Subtrair");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("9. Sair");
					
			int escolha = leitura.nextInt();
			
			if (escolha == 1) {
				System.out.println("Digite o primeiro n�mero");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo n�mero");
				float y = leitura.nextFloat();
				
				System.out.println(" A soma de " + x +  " por " + y + " � igual a: " + (x + y) );
				System.out.println();
				
			}
			else if (escolha == 2) {
				System.out.println("Digite o primeiro n�mero");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo n�mero");
				float y = leitura.nextFloat();
				
				System.out.println(" A subtra��o de " + x +  " por " + y + " � igual a: " + (x - y) );
				System.out.println();
				
			}
			
			else if (escolha == 3) {
				
				System.out.println("Digite o primeiro n�mero");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo n�mero");
				float y = leitura.nextFloat();
				
				System.out.println(" A multiplica��o de " + x +  " por " + y + " � igual a: " + (x * y) );
				System.out.println();
													
			}
			
			else if (escolha == 4) {
				System.out.println("Digite o primeiro n�mero");
				float x = leitura.nextFloat();
				System.out.println("Digite o segundo n�mero");
				float y = leitura.nextFloat();
				
				System.out.println(" A divis�o de " + x +  " por " + y + " � igual a: " + (x / y) );
				System.out.println();
				
			}
			
			else if (escolha == 9 ) {
				break;
			}
			
			else {
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
				System.out.println();
			}
			
			
		} while (true);
		
		leitura.close();
										
		
		
	}

}
