// Síntese Atividade 9
// Objetivo: programa em Java que receba
//o valor inicial e imprima o número de meses necessários. 
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		
		Meses meses;
		
		Scanner scanner = new Scanner(System.in);
		
		int i=0;
		System.out.print("Digite o valor do deposito: ");
		float valor = scanner.nextInt();
		
		meses=new Meses(i,valor);
		
		scanner.close();

}
}