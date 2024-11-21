import javax.swing.*;

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {

		int numTerms = Integer.parseInt(args[0]);
		int n = 0;
		double sum = 0;

		for(int i = 0; i < numTerms; i++) {
			double formula = Math.pow(-1, n) / ((2 * n) + 1);
			sum += formula;
			n++;
		}

		double javaPi = Math.PI;
		System.out.println("pi according to Java: " + javaPi);

		double finalAnswer = 4 * sum;
		System.out.println("pi, approximated:     " + finalAnswer);

	}
}
