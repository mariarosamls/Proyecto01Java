package com.laboratorio.tarea04;
import java.util.Scanner;
public class DivisibleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduce un n�mero");
		int numero = sc.nextInt();
		if(numero%2==0) {
			System.out.println("El n�mero "+numero+" es divisible entre 2");
		}else {
			System.out.println("El n�mero "+numero+" no es divisible entre 2");
		}
		sc.close();
	}

}
