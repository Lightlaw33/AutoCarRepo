package avaliacao_leandro;

public class ClasseCarros extends ClasseAutomotores {
	int qtdPortasAt;
	public ClasseCarros(String corPar, String tipoPar, String modeloPar, String marcaPar, int qtdPortasPar) {
		
		super(corPar, tipoPar, marcaPar, modeloPar );
		
		this.qtdPortasAt = qtdPortasPar;
		
	}
	public int pegarcarga() {
		return qtdPortasAt;
	}


		public void alterarcargaSuportada(int qtdPortasPar) {
		this.qtdPortasAt = qtdPortasPar;
	}


	}

