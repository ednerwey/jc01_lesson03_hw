package edu.jc01.les03.hw;

public class Task03 {

	public static void main(String[] args) {
		
		int x1 = 3;
		int y1 = 7;
		int x2 = 4;
		int y2 = 2;
		int x3 = 9;
		int y3 = 0;
		double a, b, c;
		double p, p2, s;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		System.out.println("Первая сторона треугольника = " + a + "\nВторая сторона треугольника = " + b
				+ "\nТретья сторона треугольника = " + c);

		p = a + b + c;
		p2 = p / 2; 
		s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));

		System.out.println("Периметр = " + p + "\nПлощадь = " + s);
		
	}

}
