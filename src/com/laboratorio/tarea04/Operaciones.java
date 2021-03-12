package com.laboratorio.tarea04;

public class Operaciones {
	int num1;
	int num2;
	
	public Operaciones(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
	public String toString() {
		return "Operaciones [num1: " + num1 + " | num2: " + num2 + "]";
	}
	
	public int Suma() {
		return num1 + num2;
	}
	public int Resta() {
		return num1-num2;
	}
	public int Multiplicacion() {
		return num1*num2;
	}
	public int Division() {
		return num1/num2;
	}
		
	}
	
	
	

