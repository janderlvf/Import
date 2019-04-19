package model.domain;

public class TransacaoImportacao implements Lote {
	
	private char tipo;
	
	private String numeroConta;

	private String numeroPlastico;
	
	private String nuemroTransacao;
	
	private Double valorTransacao;
	
	private String dataTransacao;
	
	private String horaTransacao;
	
	private String codigoEstabelecimento;

	@Override
	public String getTipoLote() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroPlastico() {
		return numeroPlastico;
	}

	public void setNumeroPlastico(String numeroPlastico) {
		this.numeroPlastico = numeroPlastico;
	}

	public String getNuemroTransacao() {
		return nuemroTransacao;
	}

	public void setNuemroTransacao(String nuemroTransacao) {
		this.nuemroTransacao = nuemroTransacao;
	}

	public Double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(Double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public String getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(String dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getHoraTransacao() {
		return horaTransacao;
	}

	public void setHoraTransacao(String horaTransacao) {
		this.horaTransacao = horaTransacao;
	}

	public String getCodigoEstabelecimento() {
		return codigoEstabelecimento;
	}

	public void setCodigoEstabelecimento(String codigoEstabelecimento) {
		this.codigoEstabelecimento = codigoEstabelecimento;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TransacaoImportacao [tipo=" + tipo + ", numeroConta=" + numeroConta + ", numeroPlastico="
				+ numeroPlastico + ", nuemroTransacao=" + nuemroTransacao + ", valorTransacao=" + valorTransacao
				+ ", dataTransacao=" + dataTransacao + ", horaTransacao=" + horaTransacao + ", codigoEstabelecimento="
				+ codigoEstabelecimento + "]";
	}
	
	
	
	
	
	

}
