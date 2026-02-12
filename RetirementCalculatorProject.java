import java.util.Scanner;

public class RetirementCalculatorProject {
 {
	
	// Constants for compounding periods
	private static final int ANNUALLY = 1;
	private static final int MONTHLY = 12;
	private static final int DAILY = 365;
	
	public static void main(string[] args) {
		Scanner sc = new scanner(System.in);
				boolean runAgain = true;
				
				while (runAgain) {
					runProgram(sc);
					runAgain = askrunagain(sc);
				}
				
				System.out.println("\nThank you for using the Retirement Growth Simulator!");
				sc.close();
	}
	
	/**
	 * Main Program Logic - gets user input and runs simulation
	 */
	private static void runProgram(Scanner sc) {
		System.out.println("\n=================================");
		System.out.println("   Retirement Growth Simulator");
		System.out.println("\n=================================");
		
		// Get user inputs
		int currentAge = readIntInRange(sc, "Enter your current age (18-100): ", 18, 100);
		int retirementAge = readIntInRange(sc, "Enter your retirement age (" + (currentAge + 1) + "-100): ");
		double currentBalance = readDoubleInRange(sc, "Enter current balance ($0-$100,000): ", 0.0, 100000.0);
		double annualContribution = readDoubleInRange(sc, "Enter annual contribution ($0-$100,000): ", 0.0, 100000.0);
		int compoundingPeriod = readCompoundingChoice(sc);
		double contributionIncrease = readDoubleInRange(sc, "Enter annual contribution increase rate (0-15%): ", 0.0, 15.0);
		
		// Run the simulation
		runSimulation(currentAge, retirementAge, currentBalance, annualContribution, annualRate, compoundingPeriod, contributionIncrease);
	}
	
	/**
	 * Reads an integer within a specified range
	 */
	private static int readIntInRange(Scanner sc, String prompt, int min, int max) {
		while (true) {
			System.out.print(prompt);
		}
	}

}

}
