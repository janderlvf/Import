import java.text.ParseException;

import model.domain.ClienteImportacao;
import model.domain.PlasticoImportacao;

public class ProcessadoraPlastico implements ProcessadorLinha<PlasticoImportacao> {

	@Override
	public PlasticoImportacao getLinha(String linha) throws ParseException {
		PlasticoImportacao plastico = new PlasticoImportacao();
		plastico.setTipo(linha.charAt(1));
		plastico.setNumeroConta(linha.substring(2,9));
		plastico.setNome(linha.substring(9,39).trim());
		plastico.setCpf(linha.substring(39,50).trim());
		plastico.setNumeroPlastico(linha.substring(50,57).trim());
		return plastico;
	}

	
}
