package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.modelCertidao;

import br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.modelContrato.Contratos;
import br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.util.Total;

public abstract class Certidoes implements Total{
	private int numRegistroCertidao;
	private String pessoasCertidoes;
	private String declarantes;
	private String tipoCertidao;
	private String dataEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	
	private static int total;
	
	//M�TODOS
	
	@Override
	public void getTotal() {
		System.out.println("Total de certid�es criadas: " + this.total);
	}
	
	
	private void registro() {
		System.out.println("\n==== REGISTRO DA CERTID�O ====");
		System.out.println("Numero de Registro Certid�o: " + getNumRegistroCertidao()
		+ "\nNome de pessoas das certid�es: " + getPessoasCertidoes()
		+ "\nNome dos declarantes: " + getDeclarantes()
		+ "\nTipo de certidao: " + getTipoCertidao()
		+ "\nData de emiss�o: " + getDataEmissao()
		+ "\nData de registro: " + getDataEmissao()
		+ "\nNome do tabeli�o: " + getNomeTabeliao()
		+ "\nNome do cart�rio: " + getNomeCartorio());
	}
	
	public void emitirCertidao(Certidoes certidao) {
		if(getPessoasCertidoes() == null) {
			throw new IllegalArgumentException("A certid�o est� nulo, ele n�o tem registros!");
		}
		certidao.registro();
	}
	
	//CONSTRUTOR
	public Certidoes(){
		this.total++;
	}
	
	
	//GETTERS E SETTERS
	public int getNumRegistroCertidao() {
		return numRegistroCertidao;
	}
	public void setNumRegistroCertidao(int numRegistroCertidao) {
		this.numRegistroCertidao = numRegistroCertidao;
	}
	public String getPessoasCertidoes() {
		return pessoasCertidoes;
	}
	public void setPessoasCertidoes(String pessoasCertidoes) {
		this.pessoasCertidoes = pessoasCertidoes;
	}
	public String getDeclarantes() {
		return declarantes;
	}
	public void setDeclarantes(String declarantes) {
		this.declarantes = declarantes;
	}
	public String getTipoCertidao() {
		return tipoCertidao;
	}
	public void setTipoCertidao(String tipoCertidao) {
		this.tipoCertidao = tipoCertidao;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
}
