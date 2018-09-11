package animal;

public class Caracteristica {
	private float peso;
	private String cor;
	private float altura;
	
	public void show() {
		System.out.printf(
				  "Peso: %.2f\n"
				+ "Altura: %.2f\n"
				+ "Cor: %s\n",
				peso,
				altura,
				cor
				);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(double d) {
		this.altura = (float) d;
	}
	
}
