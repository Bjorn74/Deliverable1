import java.util.Scanner;
import java.time.format.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Deliverable2 {

	public static void main(String args[]) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Declare Variables
		
		String inputOne;
		String inputTwo;
		int checkVal = 0;
		LocalDate dateOne = LocalDate.now();
		LocalDate dateTwo = LocalDate.now();
		
		// While Loop Verifies Input
		while (checkVal == 0) {
		
		System.out.println("Enter First Date (YYYY/MM/DD):");
		inputOne = scnr.next();
		
		if (inputOne.matches("([0-9]{4})/([0-9]{2})/([0-9]{2})")) { // Checks Formatting
			checkVal = 1;
			String str = (inputOne + " 00:00");  // Preps data for DateTime
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			LocalDateTime dateTimeOne = LocalDateTime.parse(str, formatter);
			dateOne = dateTimeOne.toLocalDate(); //Converts to LocalDate to use Period
		}
		}
		
		
		// Reinit Variable to reset
		checkVal = 0;
		
		// While Loop Verifies Input
		while (checkVal == 0) {
			
		System.out.println("Enter Second Date (YYYY/MM/DD):");
		inputTwo = scnr.next();
		
		if (inputTwo.matches("([0-9]{4})/([0-9]{2})/([0-9]{2})")) {
			checkVal = 1;
			String str = (inputTwo + " 00:00");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
			LocalDateTime dateTimeTwo = LocalDateTime.parse(str, formatter);
			dateTwo = dateTimeTwo.toLocalDate();
		}
		}
		
		// Checkpoint
		//System.out.println(dateOne);
		//System.out.println(dateTwo);
		
		// Figure Out Which Date Is Earlier
		Period p;
		if (dateTwo.isAfter(dateOne)) {
			p = Period.between(dateOne, dateTwo); // Calculates Difference into Period type
			//System.out.println("1"); //Checkpoint
		}
		else {
			p = Period.between(dateTwo, dateOne); // Calculates Difference into Period type
			//System.out.println("2"); //Checkpoint
		}
		
		// Print Result
		System.out.println(p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days.");

}
}