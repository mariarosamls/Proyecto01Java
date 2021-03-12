package com.laboratorio.tarea04;

import java.util.Scanner;

public class PrecioProductoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce el precio del producto");
		
		int precio = sc.nextInt();
		float codigo = (float) precio*0.21f;
		System.out.println("El IVA del precio del producto es: "+codigo);
		
		sc.close();
	}
	
}
