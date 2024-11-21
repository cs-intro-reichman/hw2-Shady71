import java.awt.*;

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 0;

		for (int i = 1; i <= seed; i++) {
			int num = i;
			if (mode.equals("v")) {
				while (num != 1) {
					System.out.print(num + " ");
					if (num % 2 == 0) {
						num = num / 2;
					} else {
						num = (num * 3) + 1;
					}
				}
				System.out.println(num + " ");
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1");
	}
}