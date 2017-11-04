package implementacao;

public abstract class RecuperadorArquivo {

	private RecuperadorArquivo proximoRecuperador;

	public RecuperadorArquivo(RecuperadorArquivo proximoRecuperador) {
		this.proximoRecuperador = proximoRecuperador;
	}

	public Arquivo recuperar(String nome) {
		Arquivo a = recuperaArquivo(nome);
		if (a == null || !a.isValido())
			return chamarProximo(nome);
		else
			return a;
	}
	
	protected Arquivo chamarProximo(String nome) {
		if(this.proximoRecuperador == null) 
			throw new RuntimeException("Erro ao recuperar arquivo");
		
		return this.proximoRecuperador.recuperar(nome);
	}

	protected abstract Arquivo recuperaArquivo(String nome);
}
