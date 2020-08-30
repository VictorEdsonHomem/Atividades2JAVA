
public class Mercadoria {
	float valor;
	float pagamento;
	
	public Mercadoria(float valor) {
		this.valor = valor;
		this.calculo();
	}

	public void calculo() {
		this.pagamento = (this.valor*0.9f);	}
}
