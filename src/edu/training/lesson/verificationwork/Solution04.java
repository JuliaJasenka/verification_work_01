package edu.training.lesson.verificationwork;

import java.util.Random;

public class Solution04 {

	public static void main(String[] args) {
		int n = 5;

		double[] x = new double[n];
		double[] y = new double[x.length];

		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = random.nextDouble(4.0) - 1.0;
			System.out.printf("x = %5.2f ", x[i]);
			y[i] = random.nextDouble(4.0) - 1.0;
			System.out.printf("y = %5.2f ", y[i]);
			System.out.println(" ");
		}
		System.out.println(" ");

		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] >= -2 && x[i] <= 0 && y[i] <= 2 && y[i] >= 0
					|| x[i] <= 2 && x[i] >= 0 && y[i] <= 1 && y[i] >= -1) {
				count = count + 1;
			}
		}
		System.out.println("Количество точек, попадающих в заданную область: " + count);
	}
}
