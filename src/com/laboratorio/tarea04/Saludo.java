package com.laboratorio.tarea04;

public class Saludo {
	String nombre;

	public Saludo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Bienvenid@ " + nombre +"!";
	}
	
	
}
