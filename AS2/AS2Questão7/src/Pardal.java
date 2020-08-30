
public class Pardal {
int veloc;

public Pardal(int veloc) {
	this.veloc=veloc;
	this.calculo();
}

public void calculo() {
	if(veloc>80)
	System.out.print("O USUÁRIO ULTRAPASSOU A VELOCIDADE MÁXIMA E SERÁ MULTADO");
	else
		System.out.print("O USUÁRIO ESTÁ DENTRO DO LIMITE MÁXIMO DE VELOCIDADE.");

}
}
