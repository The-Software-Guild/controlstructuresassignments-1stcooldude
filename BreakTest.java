package ControlStructures;

import java.lang.Math;

public class BreakTest {

	public static void main(String[] args) {

		boolean prime;
		
		for (int i = 2; i<=100; i++) {
			int x = (int) Math.sqrt(i);
			prime = true;
			for (int j = 2; j<=x; j++) {
				if (i%j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i + " is prime");
			}
		}

	}

}
