package pt.upacademy.HelloWorld;


public class HelloWorld {

	public static void main(String[] args) {
		ScannerUtils scu = new ScannerUtils();

		System.out.println("Hello! What's Your Name?");
		String name = scu.getText();
		System.out.println( name + ", now enter your age");
		int age = scu.getInt();

		System.out.println("Age:" + age);
	}

}

