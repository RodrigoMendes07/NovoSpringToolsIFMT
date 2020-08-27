package edu.ifmt.cobrancaifmt2.model;

public enum StatusTitulo {

	PENDENTE("Pendente"), RECEBIDO("Recebido");

	private String descricao;

	private StatusTitulo(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}

	public String getDescricao () {
		return descricao;
	}

}
