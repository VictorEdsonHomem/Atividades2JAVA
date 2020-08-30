
public class Numero {
int valor;

public Numero(int valor) {
	this.valor=valor;
	this.verifica();
}

public void verifica() {
if(valor<0)
	System.out.print("O número é negativo");
if(valor>0)
System.out.print("O número é positivo");
else 
	System.out.print("O número é igual 0");
}
}
