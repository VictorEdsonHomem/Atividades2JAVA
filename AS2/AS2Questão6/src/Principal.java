// Síntese Atividade 6
// Objetivo: Programa em Java que receba o número de maçãs compradas,
//calcule e imprima o custo total da compra.
// Autor : Victor Edson da Cruz Homem 
// Data :30/08/2020
import java.util.Scanner;

public class Principal {

	public static void main (String [] args) {
		CarrinhoMaca carrinhoMaca;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de maças: ");
		int quant = scanner.nextInt();
		
		carrinhoMaca= new CarrinhoMaca(quant);

		scanner.close();
		
	}
}
