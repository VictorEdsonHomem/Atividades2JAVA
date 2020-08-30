// Síntese Atividade 5
// Objetivo: Programa em Java que receba um número inteiro, verifique e imprima se este número é par ou
//ímpar.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String []args) {
		Numero numero;
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite o numero inteiro: ");
		int valor = scanner.nextInt();
		
		numero =new Numero(valor);
		scanner.close();
		
	}
	
}
