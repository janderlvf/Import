import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {
	
    private String nomeArquivo;
	public BufferedReader abrirArquivo(String arquivo) throws FileNotFoundException {
		File file = new File(arquivo);
		setNomeArquivo(file.getName());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
	public List<String> lerArquivo(String arquivo) throws FileNotFoundException,IOException {
		this.nomeArquivo = arquivo;
		BufferedReader br = abrirArquivo(arquivo);
		List<String> lista = new ArrayList<>();
		while (br.ready()) {
			lista.add(br.readLine());
		}
		return lista;
	}
	
	public String getNomeArquivo() {
		String[] strNome= nomeArquivo.split("_");
		
		return strNome[0].toString().toUpperCase();
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	/*public static void main(String args[]) throws IOException,FileNotFoundException {
		LeituraArquivo la = new LeituraArquivo();
		String dir = System.getProperty("user.dir") + "/arquivos/";
		List<String> lista = la.lerArquivo(dir+"Cliente_20140220.txt");
		System.out.println(lista);
		
	}*/

}
