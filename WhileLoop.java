package ControlStructures;

public class WhileLoop {

	public static void main(String[] args) {
		int x = 80808;
		int reverse = 0;;
		int remainder;
		int y = x;
		
		while (x != 0) {
			remainder = x % 10;
		    reverse = reverse * 10 + remainder;
		    x /= 10;
		}
		
		if (y == reverse) {
			System.out.println("Is palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
