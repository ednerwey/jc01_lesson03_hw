package edu.jc01.les03.hw;

public class Task01 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		double c;
		double s, p;
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;
		s = a * b / 2;
		
		System.out.println("Периметр = " + p + "\nПлощадь = " + s);

	}

}
