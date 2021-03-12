package com.laboratorio.tarea04;

public class NumeroMayorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumeroMayor numeromayor1 = new NumeroMayor(5,10);
			System.out.println(numeromayor1.toString());
			System.out.println("El número mayor es "+numeromayor1.Mayor());
			System.out.println("El número menor es "+numeromayor1.Menor());
			System.out.println(numeromayor1.Igual());
	}

}
