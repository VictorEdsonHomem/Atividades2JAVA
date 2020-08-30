
public class Termometro {
	float farenheit;
	float celsius;
	
	
	public Termometro(float celsius) {
		this.celsius = celsius;
		this.converter();
	}

	public void converter() {
		this.farenheit = ((this.celsius * 9) / 5) + 32;
	}

}
