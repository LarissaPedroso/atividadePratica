package atividadePratica;

import java.util.Scanner;

public class AtividadePratica1 {

	public static void main(String[] args) {
		double salario;
		double abono;
		double novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nLeia o Salário: ");
		salario = leia.nextDouble();
		
		System.out.print("\nDigite o Abono: ");
		abono = leia.nextDouble();
		
		novoSalario = salario + abono;
		System.out.printf("\nNovo Salário: %.2f", novoSalario);
	}

}
