package edu.training.lesson.verificationwork;

public class Solution02 {

	public static void main(String[] args) {

		int n = 10;
		double a = 0.5;
		double b = 1.0;
		double h = (b - a) / n;
		double y;
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t№ п/п\t|\tx\t|\ty\t\t|\n");
		System.out.println("---------------------------------------------------------");

		int k = 0;
			for (double x = a; x <= b; x = x + h) {
				y = Solution01.function(x);
				k = k + 1;
				System.out.printf("|\t%d\t|\t%2.2f\t|\t%2.6f\t|\n", k, x, y);
			}
		System.out.println("---------------------------------------------------------");
	}
}
