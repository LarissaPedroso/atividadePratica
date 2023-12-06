package atividadePratica;

import java.util.Scanner;

public class AtividadePratica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioBruto;
		double adicionalNoturno;
		double horasExtras;
		double descontos;
		double salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextDouble();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextDouble();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextDouble();
		
		System.out.print("Descontos: ");
		descontos = leia.nextDouble();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		System.out.printf("Salário Liquido: %.2f", salarioLiquido);
	}
}
