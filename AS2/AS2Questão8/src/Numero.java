
public class Numero {
int valor;

public Numero(int valor) {
	this.valor=valor;
	this.verifica();
}

public void verifica() {
if(valor<0)
	System.out.print("O n�mero � negativo");
if(valor>0)
System.out.print("O n�mero � positivo");
else 
	System.out.print("O n�mero � igual 0");
}
}
