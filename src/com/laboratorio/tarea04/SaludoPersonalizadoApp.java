package com.laboratorio.tarea04;
import java.util.Scanner;
public class SaludoPersonalizadoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Bienvenid@ "+nombre);
		sc.close();
	}
	
}
