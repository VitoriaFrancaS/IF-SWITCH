package CodigoInicial;

import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		
		float A,B,C;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n Entre com o valor de A: ");
		A = input.nextFloat();
		
		System.out.println("\n Entre com o valor de B: ");
		B = input.nextFloat();
		
		System.out.println("\n Entre com o valor de C: ");
		C = input.nextFloat();
		
		if (A+B == C) {
			System.out.println("\n A soma é igual ao valor de C");
		} else if (A+B > C) {
			System.out.println("\n O valor da soma é maior que o valor de C");
		} else if (A+B < C) {
			System.out.println("\n O valor da soma é menor quue o valor de C");
			
		}
	}

}
