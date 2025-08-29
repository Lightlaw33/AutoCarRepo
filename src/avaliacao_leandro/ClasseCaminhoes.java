package avaliacao_leandro;

public class ClasseCaminhoes extends ClasseAutomotores{
	float cargaSuportadaAt;
	
public ClasseCaminhoes(String corPar, String tipoPar, String modeloPar, String marcaPar, float cargaSuportadaPar) {
		
		super(corPar, tipoPar, marcaPar, modeloPar);
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}

}
