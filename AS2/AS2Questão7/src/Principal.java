// Síntese Atividade 7
// Objetivo: Programa em Java que receba a velocidade de um motorista na rodovia.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		Pardal pardal;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a velocidade do veiculo: ");
		int veloc = scanner.nextInt();
		
		pardal=new Pardal(veloc);
		
		scanner.close();
		
	}

}