// Síntese Atividade 3
// Objetivo: Programa em Java que receba o valor total de uma compra e o valor pago pelo cliente, calcule e
//imprima o valor do troco.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020


import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		
		Cupom cupom;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		float valor = scanner.nextFloat();
		System.out.println("Digite o valor pago: ");
		float pago = scanner.nextFloat();
		cupom = new Cupom(valor,pago);
	
		System.out.println("O troco foi de: R$"+cupom.troco);
		scanner.close();
	}
	

}