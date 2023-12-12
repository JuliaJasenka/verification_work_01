package edu.training.lesson.verificationwork;

public class Solution01 {

	public static void main(String[] args) {
		double x = 0.5;

		double result = function(x);

		System.out.printf("При х = " + x + " , результат вычисления " + "%.5f ", result); // проверка 2.45833
	}

	public static double function(double x) {
		return Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0))) + 1.7;
	}
}
