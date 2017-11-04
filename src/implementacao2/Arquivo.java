package implementacao2;

public class Arquivo {

	private String nome;

	public Arquivo(String nome) {
		this.nome = nome;
	}
	
	public Arquivo() {}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isValido() {
		return this.nome != null;
	}

}
