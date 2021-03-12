package com.laboratorio.tarea04;

import java.util.Scanner;

public class VentasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce el número de ventas");
		int numVentas=sc.nextInt();
		int sumaVentas=0;
		for (int i=0;i<numVentas;i++) {
			System.out.println("Por favor introduce el número de la ventas "+(i+1));
			int venta=sc.nextInt();
			sumaVentas=sumaVentas+venta;
		}
		System.out.println("La suma del precio total de ventas es de: "+sumaVentas);
		sc.close();
	}
	

}
