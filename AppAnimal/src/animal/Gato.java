package animal;

public class Gato extends Animal {
	private boolean castrado;
	
	public void show() {
		super.show();
		System.out.println();
		System.out.printf("Castrado: %s\n",
				castrado ? "Sim" : "Não"
				);
		System.out.println();

	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
}
