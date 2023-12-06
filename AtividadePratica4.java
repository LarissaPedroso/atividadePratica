package atividadePratica;

import java.util.Scanner;

public class AtividadePratica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Numero 2: ");
		numero2 = leia.nextFloat();
		
		System.out.print("Numero 3: ");
		numero3 = leia.nextFloat();
		
		System.out.print("Numero 4: ");
		numero4 = leia.nextFloat();
		
		calculo = (numero1*numero2) - (numero3*numero4);
		
		System.out.printf("Resultado: %.2f", calculo);
		
	}

}
