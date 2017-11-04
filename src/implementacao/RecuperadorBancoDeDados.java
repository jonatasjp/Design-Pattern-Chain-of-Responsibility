package implementacao;

public class RecuperadorBancoDeDados extends RecuperadorArquivo {
	
	public RecuperadorBancoDeDados(RecuperadorArquivo proximo) {
		super(proximo);
	}

	protected Arquivo recuperaArquivo(String nome) {
		//L�gica aleat�ria, apenas para definir se ser� retornado um arquivo v�lido ou null
		if(nome.length() % 2 == 0)
			return new Arquivo(nome);
		
		return new Arquivo();
	}

	protected Arquivo chamarProximo(String nome) {
		Arquivo a = super.chamarProximo(nome);
		return a;
	}
}