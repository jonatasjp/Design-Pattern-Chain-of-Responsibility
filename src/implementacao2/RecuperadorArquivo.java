package implementacao2;

public abstract class RecuperadorArquivo {

	private RecuperadorArquivo proximoRecuperador;

	public RecuperadorArquivo(RecuperadorArquivo proximoRecuperador) {
		this.proximoRecuperador = proximoRecuperador;
	}

	public Arquivo recuperar(String nome) {
		return recuperaArquivo(nome);
	}
	
	protected void verificarProximoValido() {
		if(this.proximoRecuperador == null) 
			throw new RuntimeException("Erro ao recuperar arquivo");
	}

	protected abstract Arquivo recuperaArquivo(String nome);

	protected RecuperadorArquivo getProximoRecuperador() {
		return proximoRecuperador;
	}
	
}
