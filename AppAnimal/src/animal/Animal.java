package animal;

public abstract class Animal {
	private int idade;
	private String nome;
	private String[] donos = new String[0];
	
	public void show() {
		System.out.printf(
				  "Nome: %s\n"
				+ "Idade: %d\n"
				+ "Donos: ",
				nome,
				idade			
				);
		mostrarDonos();
	}
	public void mostrarDonos() {
		for(int i = 0; i < donos.length; i++) {
			System.out.printf("%s ", donos[i]);
		}
			
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getDonos() {
		return donos;
	}

	public void setDonos(String[] donos) {
		this.donos = donos;
	}
	
}
