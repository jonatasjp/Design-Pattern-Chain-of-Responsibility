package implementacao2;

public class RecuperadorBancoDeDados extends RecuperadorArquivo {
	
	public RecuperadorBancoDeDados(RecuperadorArquivo proximo) {
		super(proximo);
	}

	protected Arquivo recuperaArquivo(String nome) {
		//Lógica aleatória, apenas para definir se será retornado um arquivo válido ou null
		if(nome.length() % 2 == 0)
			return new Arquivo(nome);
		
		verificarProximoValido();

		return getProximoRecuperador().recuperar(nome);
	}

}