// S�ntese Atividade 2
// Objetivo: Programa em Java que leia o valor de uma determinada mercadoria de uma loja. Sabendo que o
//desconto para pagamento � vista � de 10% sobre o valor total, calcule o valor a ser pago � vista. Escreva o
//valor total, o valor do desconto e o valor a ser pago � vista.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Mercadoria mercadoria = null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		float valor = scanner.nextFloat();
		
		mercadoria = new Mercadoria(valor);
		
		System.out.print("O valor com 10% de desconto para pagamento avista = R$"+ mercadoria.pagamento);
		
		scanner.close();
	}
	

}
