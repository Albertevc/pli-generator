package br.com.magna.model;

import java.util.List;

public class Projeto {
	
	private String nome;
	private List<Arquivo> arquivos;
	
	public String getNome() {
		return nome;
	} 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Arquivo> getArquivos() {
		return arquivos;
	}
	
	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
	
}
