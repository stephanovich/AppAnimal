package animal;

public class Cachorro extends Animal {
	private String raca;
	private Caracteristica caracteristica;
	
	public void show() {
		super.show();
		System.out.println();
		caracteristica.show();
		System.out.printf("Raça: %s\n",raca);
		System.out.println();
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
}
