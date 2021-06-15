package com.pruebas;

public class Disco {
	private String grupo;
	private String titulo;
	
	public Disco() {
		System.out.println("Disco construido");
		
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Disco [grupo=" + grupo + ", titulo=" + titulo + "]";
	}
	
	

}
