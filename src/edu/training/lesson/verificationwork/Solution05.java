package edu.training.lesson.verificationwork;

public class Solution05 {

	public static void main(String[] args) {

		double y;

		double a = 1;
		double x1 = -2 * a;
		double dx = a / 5;
		int n = 2;

		for (double x = x1; x <= n; x = x + dx) {
			if (x <= 0) {
				y = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
			}
			System.out.printf("При х = %3.2f\t у = %3.2f\n", x,y);
		}
	}
}
