package edu.jc01.les03.hw;

public class Task07 {

	public static void main(String[] args) {

		int a = 19;
		int b = -9;

		double arf, geom;

		arf = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		geom = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Cреднее арифметическое = " + arf + "\nСреднее геометрическое = " + geom);

	}

}
