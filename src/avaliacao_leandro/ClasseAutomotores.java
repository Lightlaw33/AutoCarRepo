package avaliacao_leandro;

public class ClasseAutomotores {
	String marcaAt;
	String modeloAt;
	String tipoAt;
	String corAt;


	public ClasseAutomotores() {
	
	}
	
	public ClasseAutomotores(String marcaPar, String modeloPar, String tipoPar, String corPar) {
		
		this.marcaAt = marcaPar;
		this.modeloAt = modeloPar;
		this.tipoAt = tipoPar;
		this.corAt = corPar;
		
		
	}
	public String pegarcor() {
		return corAt;
	}
	public String pegarmarca() {
		return marcaAt;
	}
	public String pegartipo() {
		return tipoAt;
	}
	public String pegarmodelo() {
		return modeloAt;
	}
	
	public void alterarCor(String corPar) {
		this.corAt = corPar;
	}
	
	public void alterarMarca(String marcaPar) {
		this.marcaAt = marcaPar;
	}
	
	public void alterarTipo(String tipoPar) {
		this.tipoAt = tipoPar;
	}
	
	public void alterarModelo(String modeloPar) {
		this.modeloAt = modeloPar;
	}
}
