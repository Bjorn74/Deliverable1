import java.util.Scanner;

public class Deliverable1 {

	public static void main(String args[]) {
		

		Scanner scnr = new Scanner(System.in);
		
		int numberOne = 1;
		int numberTwo = 1;
		
		while ((numberOne > 999) || (numberOne < 100)) {
			System.out.println("Enter First 3-Digit Number:");
		numberOne = scnr.nextInt();
		}
		
		while ((numberTwo > 999) || (numberTwo < 100)) {
		
		System.out.println("Enter Second 3-Digit Number:");
		numberTwo = scnr.nextInt();
		}
		
		//Test point- Print variables
		//System.out.println(numberOne);
		//System.out.println(numberTwo);
		
		int[] numArray = new int[2];
		numArray[0] = numberOne;
		numArray[1] = numberTwo;
		
		String answer = task(numArray);
		
		System.out.println(answer);
		
	}
	
	public static String task(int[] numbers) {
		
	
	
	/* Process Numbers */
		
		// Convert to Strings
		
		String numOne = Integer.toString(numbers[0]);
		String numTwo = Integer.toString(numbers[1]);
		
		//System.out.print(numOne + " " + numTwo);
		
		// Read Characters into variables
		
		
		char a = (numOne.charAt(0));
		char b = (numOne.charAt(1));
		char c = (numOne.charAt(2));
		char x = (numTwo.charAt(0));
		char y = (numTwo.charAt(1));
		char z = (numTwo.charAt(2));
		
		// Do the Math
		
		int first = (Character.getNumericValue(a) + Character.getNumericValue(x));
		int second = (Character.getNumericValue(b) + Character.getNumericValue(y));
		int third = (Character.getNumericValue(c) + Character.getNumericValue(z));
		
		// Compare
		
		String result;
		if (first == second && (first == third)) {
			result = "True";
		}
		else {
			result = "False";
			} 
		 
		// Return Answer
		return result;
		

	}
}
			
	


