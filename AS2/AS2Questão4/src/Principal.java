// Síntese Atividade 4 
// Objetivo: Programa em Java que receba o preço do litro da gasolina e o valor que o motorista deseja
//abastecer, calcule e imprima a quantidade de litros correspondente a este valor.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020


import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		Gasolina gasolina;
		
		System.out.println("Qual o preço do litro da gasolina: ");
		float valorGas = scanner.nextFloat();
		System.out.println("Qual o valor que deseja abastecer: ");
		float valorClientGas = scanner.nextFloat();
		
		gasolina=new Gasolina(valorGas,valorClientGas);
		
		System.out.println("A quantidade de litros foi de:"+ gasolina.litros);
		scanner.close();
		
		
		
	}

}