package com.laboratorio.tarea04;

import javax.swing.JOptionPane;

public class DivisibleApp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto=JOptionPane.showInputDialog("Por favor introduce un n�mero");
		int numero=Integer.parseInt(texto);
		if (numero%2==0) {
			System.out.println("El n�mero "+numero+" es divisible entre 2");
		}else {
			System.out.println("El n�mero "+numero+" no es divisible entre 2");
		}
	}

}
