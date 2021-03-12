package com.laboratorio.tarea04;


public class OperacionesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones operacion1 = new Operaciones(10,5);
		
		System.out.println(operacion1.toString());
		System.out.println("El resultado de la suma es "+operacion1.Suma());
		System.out.println("El resultado de la resta es "+operacion1.Resta());
		System.out.println("El resultado de la multiplicación es "+operacion1.Multiplicacion());
		System.out.println("El resultado de la división es "+operacion1.Division());
		
	}

}
