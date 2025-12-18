package edu.jc01.les03.hw;

public class Task09 {

	public static void main(String[] args) {

		int a = 6;
		double s, h, rvp, rop;

		s = (Math.sqrt(3) / 4) * Math.pow(a, 2);
		h = (Math.sqrt(3) / 2) * a;
		rvp = a / (2 * Math.sqrt(3));
		rop = a / Math.sqrt(3);

		System.out.println("Площадь = " + s + "\nВысота = " + h + "\nРадиус вписанной окружности = " + rvp
				+ "\nРадиус описанной окружности = " + rop);

	}

}
