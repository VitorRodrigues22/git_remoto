package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.modelContrato;

import br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.util.Total;

public abstract class Contratos implements Total{
	
	private int numRegistroContrato;
	private String nomePartes;
	private String nomeTestemunhas;
	private String objetoContrato;
	private String dataEmissao;
	private String dataRegistro;
	private String nomeTabeliao;
	private String nomeCartorio;
	
	private static int total;
	
	//MÉTODOS
	
	@Override
	public void getTotal() {
		System.out.println("Total de contratos criados: " + this.total);
	}
	
	private void registro() {
		System.out.println("\n==== REGISTRO DO CONTRATO ====");
		System.out.println("Numero de Registro Contrato: " + getNumRegistroContrato()
		+ "\nNome partes certidão: " + getNomePartes()
		+ "\nNome das testemunhas: " + getNomeTestemunhas()
		+ "\nObjeto do contrato: " + getObjetoContrato()
		+ "\nData de emissão: " + getDataEmissao()
		+ "\nData de registro: " + getDataRegistro()
		+ "\nNome das testemunhas: " + getNomeTestemunhas()
		+ "\nNome do tabelião: " + getNomeTabeliao()
		+ "\nNome do cartório: " + getNomeCartorio());
	}
	
	public void emitirContrato(Contratos contrato) {
		if(getNomePartes() == null) {
			throw new IllegalArgumentException("O contrato está nulo, ele não tem registros!");
		}
		contrato.registro();
	}
	
	//CONSTRUTOR
	public Contratos() {
		this.total++;
	}
	
	
	//GETTERS E SETTERS
	public int getNumRegistroContrato() {
		return numRegistroContrato;
	}
	public void setNumRegistroContrato(int numRegistroContrato) {
		this.numRegistroContrato = numRegistroContrato;
	}
	public String getNomePartes() {
		return nomePartes;
	}
	public void setNomePartes(String nomePartes) {
		this.nomePartes = nomePartes;
	}
	public String getNomeTestemunhas() {
		return nomeTestemunhas;
	}
	public void setNomeTestemunhas(String nomeTestemunhas) {
		this.nomeTestemunhas = nomeTestemunhas;
	}
	public String getObjetoContrato() {
		return objetoContrato;
	}
	public void setObjetoContrato(String objetoContrato) {
		this.objetoContrato = objetoContrato;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
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
