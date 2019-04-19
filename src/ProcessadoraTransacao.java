import java.text.ParseException;

import model.domain.ClienteImportacao;
import model.domain.TransacaoImportacao;

public class ProcessadoraTransacao implements ProcessadorLinha<TransacaoImportacao> {

	@Override
	public TransacaoImportacao getLinha(String linha) throws ParseException {
		TransacaoImportacao transacao = new TransacaoImportacao();
		transacao.setTipo(linha.charAt(0));
		transacao.setNumeroConta(linha.substring(1, 8));
		transacao.setNumeroPlastico(linha.substring(8, 15));
		double valorTransacao = Double.parseDouble(linha.substring(15,27));
		transacao.setValorTransacao(valorTransacao/100d);
		
		String dia, mes, ano, data;
		dia=linha.substring(27,29);
		mes=linha.substring(29,31);
		ano=linha.substring(31,35);
		data = dia+"/"+mes+"/"+ano;
		
		transacao.setDataTransacao(data);
		String hora = linha.substring(35,37);
		String min = linha.substring(37,39);
		String seg = linha.substring(39,41);
		String horario= hora+":"+min+":"+seg+"";
		
		transacao.setHoraTransacao(horario);
		transacao.setCodigoEstabelecimento(linha.substring(41,47));
		
		
		return transacao;
	}
	
	

}
