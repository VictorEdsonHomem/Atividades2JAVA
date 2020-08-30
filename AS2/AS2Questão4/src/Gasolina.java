
public class Gasolina {
float valorGas;
float valorClientGas;
float litros;

public Gasolina(float valorGas,float valorClientGas) {
this.valorGas=valorGas;
this.valorClientGas=valorClientGas;
this.Abastecimento();
}
public void Abastecimento() {
	litros=(valorClientGas/valorGas);
}

}
