// Síntese
// Objetivo:Converte temperatura Celsius para Farenheit
// Autor :Victor Edson da Cruz Homem
// Data :30/08/2020

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Termometro termometro = null;
		Scanner teclado = new Scanner(System.in);
		float celsius;
		
		System.out.print("Digite a temperatura: ");
		celsius = teclado.nextFloat();
		
		termometro = new Termometro(celsius);
		//termometro.converter();
		
System.out.println("Temperatura em Farenheit = "+ termometro.farenheit +" e em celsius = "+ termometro.celsius);
		
		teclado.close();
	}

}
