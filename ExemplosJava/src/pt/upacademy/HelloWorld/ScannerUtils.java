package pt.upacademy.HelloWorld;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner scan = new Scanner(System.in);

	public int getInt() {
		do {
			if (scan.hasNextInt()) {
				return scan.nextInt();
			} else {
				scan.nextLine();
			}
		} while (true);

	}

	public String getText() {
		return scan.nextLine();
	}

	public int getInRange(int min, int max) {
		int val = getInt();
		while (val >= min && val <= max) {
			return val;
		};
		System.out.println("Not a valid number, only between " + min + "-" + max);
		return getInRange(min, max);
	}

}
