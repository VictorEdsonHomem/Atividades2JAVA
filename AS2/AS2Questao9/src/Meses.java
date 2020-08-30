
public class Meses {
int i;
float valor;

public Meses(int i,float valor) {
	this.i=i;
	this.valor=valor;
	this.calculo();
}

public void calculo() {
	for (i=0;valor<10000;i++) 
		valor=valor+(valor*0.0015f);
		System.out.print("Meses necessarios:"+i);
}
}
