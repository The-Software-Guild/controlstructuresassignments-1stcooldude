package ControlStructures;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char x = 'e';
		
		switch(x) {
		case('a'):
		case('e'):
		case('i'):
		case('o'):
		case('u'):
			System.out.println("Is a vowel");
			break;
		default:
			System.out.println("Not a vowel");
		}

	}

}
