package CodigoInicial;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
				
		float n1, n2;
		int operacao;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		n1 = input.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextFloat();
		System.out.println("Agora escolha a operação que você deseja realizar ");
		System.out.println("\n 1- Soma");
		System.out.println("\n 2- Subtração");
		System.out.println("\n 3- Multiplicação");
		System.out.println("\n 4- Divisão");
		operacao = input.nextInt();

		
		switch (operacao) {
		case 1:
			System.out.println("O resultado da operção escolhida é: \n" + (n1+n2));
			break;
			
		case 2:
			System.out.println("O resultado da operção escolhida é: \n" + (n1-n2));
			break;
			
		case 3: 
			System.out.println("O resultado da operção escolhida é: \n" + (n1*n2));
			break;
			
		case 4:
			System.out.println("O resultado da operção escolhida é: \n" + (n1/n2));
			break;
			
			default:
				System.out.println("Operação invalida, tente novamente");



		
		}
	}

}
