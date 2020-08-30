
public class CarrinhoMaca {
int quant;

public CarrinhoMaca(int quant) {
	this.quant=quant;
	this.desconto();
}

public void desconto() {
	if(quant>12)
	System.out.print("O valor total : "+ quant*1);
	else
		System.out.print("O valor total : "+quant*1.3f);
}
}
