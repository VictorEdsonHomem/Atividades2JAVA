// Síntese Atividade 8
// Objetivo: Programa em Java que receba um valor e imprima se é positivo, negativo ou zero.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		
		Numero numero;
		
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		
		numero =new Numero(valor);
		
		scanner.close();
		}
}
