package teste;

import implementacao.RecuperadorArquivo;
import implementacao.RecuperadorBancoDeDados;
import implementacao.RecuperadorCacheMemoria;

public class Main {
	
	public static void main(String[] args) {
		
		
		RecuperadorArquivo recuperadorBD = new RecuperadorBancoDeDados(null);
		RecuperadorCacheMemoria recuperadorCache = new RecuperadorCacheMemoria(recuperadorBD);
		//No recuperar abaixo vai cair na implementa��o do recuperador Banco de dados e ap�s isso salva no cache
		recuperadorCache.recuperar("teste1");

		RecuperadorArquivo recuperadorBD1 = new RecuperadorBancoDeDados(null);
		RecuperadorArquivo recuperadorCache1 = new RecuperadorCacheMemoria(recuperadorBD1);
		//No recuperar abaixo deve lan�ar uma excess�o
		recuperadorCache1.recuperar("teste");
		
	}
	
}
