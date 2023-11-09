package CodigoInicial;

import java.util.Scanner;

public class QuizIf {

	public static void main(String[] args) {
		
		String p1, p2, p3;
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("\n\t\tEu quero saber em qual animal você está pensando");
		
		System.out.println("\nVocê está pensando em um animal vertebrado ou invertebrado: ");
		p1 = input.nextLine();
		
		System.out.println("\nVocê está pensando em uma Ave | Mamífero | Inseto | Anelídeo: ");
		p2 = input.nextLine();
		
		System.out.println("\nVocê está pensando em um animal Canívoro | Onívoro | Herbívoro | Hematófago: ");
		p3 = input.nextLine();
		
		if(p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("Ave")) {
				if (p3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("\nO animal que você está pensando é a Águia");
				} else if (p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nO animal que você está pensando é o Pombo");
				}
			}else if (p2.equalsIgnoreCase("Mamífero")) {
				if (p3.equalsIgnoreCase("herbívoro")) {
					System.out.println("\nO animal que você está pensando é a Vaca");
				}else if (p3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nOpa, esse não é um animal, você está pensando no homem");
				}
			}
			
		}
		
		if (p1.equalsIgnoreCase("Invertebrado")) {
			if (p2.equalsIgnoreCase("Inseto")) {
				if(p3.equalsIgnoreCase("Hematófago")) {
					System.out.println("\n O animal que você está pensando é Pulga");
				}else if(p3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("O animal que você está pensando é a Lagarta");
				}
			}else if(p2.equalsIgnoreCase("Anelídeo")) {
				if (p3.equalsIgnoreCase("Hematófago")) {
					System.out.println("O animal que você está pensando é a Sanguessuga");
				}else if (p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("O animal que você está pensando é a Minhoca");
				}
			}
		}
		
		
	}

}
