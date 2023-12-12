package edu.training.lesson.verificationwork;

public class Solution03 {

	public static void main(String[] args) {

		double x = 0.5;

		int n = 20;
		double sum = 0;

		for (double k = 1.0; k <= n; k++) {
			sum += (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0)) / Math.pow(Math.E, x - 1 / k);
		}
		double result = Math.sqrt(n * Math.PI) * sum;

		System.out.printf("%.3f", result);
	}
}
