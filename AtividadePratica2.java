package atividadePratica;

import java.util.Scanner;

public class AtividadePratica2 {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("Média final: %.1f", media);
	}
}
