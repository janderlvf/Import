package model.domain;

public class PlasticoImportacao implements Lote {
	
	private char tipo;
	
	private String numeroConta;

	private String nome;
	
	private String cpf;
	
	private String numeroPlastico;

	@Override
	public String getTipoLote() {
		return "Plastico";
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroPlastico() {
		return numeroPlastico;
	}

	public void setNumeroPlastico(String numeroPlastico) {
		this.numeroPlastico = numeroPlastico;
	}

	
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PlasticoImportacao [tipo=" + tipo + ", numeroConta=" + numeroConta + ", nome=" + nome + ", cpf=" + cpf
				+ ", numeroPlastico=" + numeroPlastico + "]";
	}
	
	
	
	

}
