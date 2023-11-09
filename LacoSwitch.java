package CodigoInicial;

import java.util.Scanner;

public class LacoSwitch {

	public static void main(String[] args) {

		int op, quantidade;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n\t\t\t LANCHONETE DO CALVO!");
		System.out.println("\n1- Cachorro Quente \nR$10,00");
		System.out.println("\n2- X- Salada \nR$15,00");
		System.out.println("\n3- X-Bacon \nR$18,00");
		System.out.println("\n4- Bauru \nR$12,00");
		System.out.println("\n5- Refrigerante lata \nR$8,00");
		System.out.println("\n6- Suco lata \nR$13,00");
		System.out.println("\n Escolha o código do item desejado: ");
		op = input.nextInt();
		
		System.out.println("\n Escolha a quantidade desejada: ");
		quantidade = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("\n Cachorro Quente");
			System.out.println(quantidade*10);
			break;
			
		case 2:
			System.out.println("\n X- Salada");
			System.out.println(quantidade*15);
			break;
			
		case 3:
			System.out.println("\n X- Bacon");
			System.out.println(quantidade*18);
			break;
			
		case 4:
			System.out.println("\n Bauru");
			System.out.println(quantidade*12);
			break;
			
		case 5:
			System.out.println("\n Refrigerante lata");
			System.out.println(quantidade*8);
			break;
			
		case 6:
			System.out.println("\n Suco lata");
			System.out.println(quantidade*13);
			break;
			
			default: 
				System.out.println("OpÃ§Ã£o invÃ¡lida!");
			
		}


	}

}
