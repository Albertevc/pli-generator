package br.com.magna.model;

import java.util.List;

public class Registro {
	
	private String autor;
	private String demanda;
	private String descricao;
	private List<Projeto> projetos;
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getDemanda() {
		return demanda;
	}
	
	public void setDemanda(String demanda) {
		this.demanda = demanda;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Projeto> getProjetos() {
		return projetos;
	}
	
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
}
