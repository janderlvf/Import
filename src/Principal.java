import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import model.domain.ClienteImportacao;
import model.domain.ContaImportacao;
import model.domain.Lote;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		LeituraArquivo la = new LeituraArquivo();
		String dir = System.getProperty("user.dir") + "/arquivos/";
		List<String> lista = la.lerArquivo(dir+"Cliente_20140220.txt");
		String arquivo = la.getNomeArquivo();
		System.out.println("Arquivo : "+arquivo);
		//File diretorio = new File(dir);
		//File[] arquivos = diretorio.listFiles();
		//for (File arquivo : arquivos) {
		
			//}
		
		
			ProcessadoraArquivo processadora = 
					new ProcessadoraArquivo(TipoArquivo.valueOf(arquivo).getProcessadorLinha());
					
					List<Lote> result = processadora.processaArquivo(lista);
		
						
						
		}

	}

