package animal;

public class Urso extends Animal {
	private Caracteristica caracteristica;
	
	public void show() {
		super.show();
		System.out.println();
		caracteristica.show();
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	
}
