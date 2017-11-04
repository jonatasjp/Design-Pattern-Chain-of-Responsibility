package implementacao2;
import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {
	
	private Map<String, Arquivo> cache = new HashMap<>();

	public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
		super(proximo);
	}

	protected Arquivo recuperaArquivo(String nome) {
		if (cache.containsKey(nome))
			return cache.get(nome);

		verificarProximoValido();
		
		Arquivo a = getProximoRecuperador().recuperar(nome);
		cache.put(nome, a);
		return a;
	}

}