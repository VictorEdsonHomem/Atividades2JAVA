
public class Cupom {
float valor;
float pago;
float troco;

public Cupom(float valor,float pago) {
	this.valor=valor;
	this.pago=pago;
	this.calculo();
}

public void calculo() {
	troco=(valor-pago);
}

}