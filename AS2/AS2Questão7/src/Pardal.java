
public class Pardal {
int veloc;

public Pardal(int veloc) {
	this.veloc=veloc;
	this.calculo();
}

public void calculo() {
	if(veloc>80)
	System.out.print("O USU�RIO ULTRAPASSOU A VELOCIDADE M�XIMA E SER� MULTADO");
	else
		System.out.print("O USU�RIO EST� DENTRO DO LIMITE M�XIMO DE VELOCIDADE.");

}
}
