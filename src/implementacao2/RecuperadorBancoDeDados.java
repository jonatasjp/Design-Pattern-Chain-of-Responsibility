package implementacao2;

public class RecuperadorBancoDeDados extends RecuperadorArquivo {

	public RecuperadorBancoDeDados(RecuperadorArquivo proximo) {
		super(proximo);
	}

	protected Arquivo recuperaArquivo(String nome) {
		// L�gica aleat�ria, apenas para definir se ser� retornado um arquivo
		// v�lido ou delegar� a execu��o para o pr�ximo recuperador de arquivo
		if (nome.length() % 2 == 0)
			return new Arquivo(nome);

		verificarProximoValido();

		return getProximoRecuperador().recuperar(nome);
	}

}