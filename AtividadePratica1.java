package atividadePratica;

import java.util.Scanner;

public class AtividadePratica1 {

	public static void main(String[] args) {
		double salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Leia o Salário: ");
		salario = leia.nextDouble();
		
		System.out.print("Digite o Abono: ");
		abono = leia.nextDouble();
		
		leia.close();
		
		novoSalario = salario + abono;
		System.out.printf("\nNovo Salário: %.2f", novoSalario);
	}

}
