package com.laboratorio.tarea04;

import javax.swing.JOptionPane;

public class CodigoASCIIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto=JOptionPane.showInputDialog("Por favor introduce un c�digo de la tabla ASCII");
		int codigo = Integer.parseInt(texto);
		char caracter= (char)codigo;
		System.out.println("ASCII : "+caracter);
	}

}
