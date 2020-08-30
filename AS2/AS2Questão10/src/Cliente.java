package loja;

public class Cliente {
	private String nome;
	private float valorCompras;
	private Bonus bonus;
	
	public Cliente(String nome, float valorCompras) {
		this.nome = nome;
		this.valorCompras = valorCompras;
		this.bonus = new Bonus();
	}

	public String getNome() {
		return nome;
	}

	public float getValorCompras() {
		return valorCompras;
	}

	public Bonus getBonus() {
		return bonus;
	}

}
