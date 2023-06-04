package ControlStructures;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		int x = 1, y = 1, z = 0, counter = 2;
		
		System.out.println(x);
		System.out.println(y);

		do {
			z = x+y;
			System.out.println(z);
			y = x;
			x = z;
			counter++;
		} while(counter<10);

	}

}
