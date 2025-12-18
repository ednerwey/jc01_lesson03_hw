package edu.jc01.les03.hw;

public class Task06 {

	public static void main(String[] args) {

		int a = 5874;
		int a1, a2, a3, a4;
		int pr;

		a1 = a / 1000;
		a2 = (a / 100) % 10;
		a3 = (a / 10) % 10;
		a4 = a % 10;

		pr = a1 * a2 * a3 * a4;

		System.out.println("Произведение = " + pr);

	}

}
