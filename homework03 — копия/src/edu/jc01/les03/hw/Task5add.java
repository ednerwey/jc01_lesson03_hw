package edu.jc01.les03.hw;

public class Task5add {
	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		double res;

		x = 10.0;
		y = 12.0;

		double temp;
		temp = Math.cos(x) - Math.sin(y);
		if (temp != 0) {
			res = (Math.sin(x) + Math.cos(y) / temp) * Math.tan(x * y);
		} else {
			System.out.println("Знаменатель равен нулю");
			res = Double.NaN;
		}
		System.out.println("Результат вычисления = " + res);
	}
}
