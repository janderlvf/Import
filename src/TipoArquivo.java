
public enum TipoArquivo {
	
	TRANSACAO("Transacao", new ProcessadoraTransacao()),
	CONTA("Conta", new ProcessadoraConta()),
	CLIENTE("Cliente", new ProcessadoraCliente()),
	PLASTICO("Plastico", new ProcessadoraPlastico());
	
	private String nomeArquivo;
	private ProcessadorLinha processadorLinha;
	private TipoArquivo(String nomeArquivo, ProcessadorLinha processadorLinha) {
		this.nomeArquivo = nomeArquivo;
		this.processadorLinha = processadorLinha;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public ProcessadorLinha getProcessadorLinha() {
		return processadorLinha;
	}
	
	
	
}
