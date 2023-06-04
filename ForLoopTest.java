package ControlStructures;

public class ForLoopTest {

	public static void main(String[] args) {
		int x = 5;
		
		int factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);

	}

}
