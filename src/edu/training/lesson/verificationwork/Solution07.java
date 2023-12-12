package edu.training.lesson.verificationwork;

public class Solution07 {

	public static void main(String[] args) {
		int n = 20;
		int m = 15;
		double xStart = 4.0;
		double xStep = 1.0;
		double zStart = 5.0;
		double zStep = 1.0;

		double y;

		System.out.println("-------------------------------------------------");
		System.out.printf("|\t x\t|\t z\t|\t y\t|\n");
		System.out.println("-------------------------------------------------");

		for (double x = xStart; x <= n; x = x + x*xStep) {
			for (double z = zStart; z <= m; z = z + z*zStep) {
				
				double powValueX = Math.pow(x, 2);
				double powValueZ = Math.pow(z, 2);
				double logZ = Math.log(z);
				
				y = Math.sqrt(powValueZ + powValueX) * logZ + Math.abs(logZ) / Math.sqrt(powValueX - powValueZ + 3.2);
				System.out.printf("|\t%2.2f\t|\t%2.2f\t|\t%2.2f\t|\n", x, z, y);
			}
		}
		System.out.println("-------------------------------------------------");
	}
}
