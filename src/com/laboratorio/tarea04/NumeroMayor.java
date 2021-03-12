package com.laboratorio.tarea04;

public class NumeroMayor {
	int num1;
	int num2;
	
	public NumeroMayor(int num1, int num2) {
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
		return "NumeroMayor [num1:" + num1 + " | num2:" + num2 + "]";
	}
	
	public int Mayor() {
		int m;
		if (num1 > num2) {
			m=num1;
		}else {
			m=num2;
		}
		return m;		
	}
	public int Menor() {
		int n;
		if (num1 < num2) {
			n=num1;
		}else {
			n=num2;
		}
		return n;
	}
	public String Igual() {
		String g;
		if (num1 == num2) {
			g="Los números son iguales";
		}else {
			g="Los números no son iguales";
		}
		return g;
	}
		
	}
	

