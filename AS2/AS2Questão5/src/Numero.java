import java.util.Scanner;
public class Numero {
	
	int valor;
	
	public Numero(int valor) {
		this.valor=valor;
		this.verificacao();
	}

	public void verificacao() {
		if (valor % 2 == 0)
			System.out.print("N�mero par!");
		else 
			System.out.print("N�mero �mpar");
	}

}
