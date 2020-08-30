package loja;

public class Loja {
	
	public void calcularBonus(Cliente cliente) {
		if (cliente.getValorCompras() >= 500000)
			cliente.getBonus().setPorcentagem(15);
		else
			cliente.getBonus().setPorcentagem(10);
		cliente.getBonus().setValor((cliente.getBonus().getPorcentagem() * cliente.getValorCompras()) / 100);
	}

}
