package pt.upacademy.HelloWorld;

public class FizzBuzz {

	public static void main(String[] args) {
		ScannerUtils scu = new ScannerUtils();
		// TODO Auto-generated method stub
		System.out.println("Number between 1 to 40");
		int userInput = scu.getInRange(1, 40);
		System.out.println(userInput);
		int i = 0;
		while (i <= userInput) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

			i++;

		}

	}

}
