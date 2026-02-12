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
			try {
				String input = sc.nextLine().trim)_;
				int value = Integer.parseInt(input);

				if(value >= min && value <= max) {
					return value;
				} else {
					System.out.println("Error: Please enter a value between " + min + " and " + max + ".");
				}
			} catch (NumberFormatException e) {
				System.out.printLn("Error: please enter a valid integer.");
			}
		}
	}

	/**
	 * Reads a double within a specified range
	 */
	private static double readDoubleInRange(Scanner sc, String prompt, double min, double max) {
		while (true) {
			System.out.print(prompt);
			try {
				String input = sc.nextLine().trim();
				double value = Double.parseDouble(input);

				if (value >= min && value <= max) {
					return value;
				} else {
					System.out.printf("Error: Please enter a value between %.2f and %.2f.%n", min, max);
				}
			} catch(NumberFormatException e) {
				System.out.println("Error: Please enter a valid number.");
			}
		}
	}
	/**
	 * Reads compounding choice from user(1=Annually, 12=Monthly, 365=Daily)
	 */
	private static int readCompundingChoice(Scanner sc) {
		while (true) {
			System.out.println("Choose compounding period:");
			System.out.println("1. Annually");
			System.out.println("2. Monthly");
			System.out.println("3. Daily");
			System.out.print("Enter choice (1-3): ");

			try {
				String input = sc.nextLine().trim();
				int choice =Integer.parseInt(input);

				switch (choice) {
					case 1: return ANNUALLY;
					case 2: return MONTHLY;
					case 3: return DAILY;

					System.out.println("Error: Please enter 1, 2, or 3.");
				} catch (NumberFormatException e) {
					System.out.println("Error: Please enter a valid menu choice.");
				}
			}
		}

		/**
		 * Runs the retirement simulation and prints results
		 */
		private static void runSimulation(int currentAge, int retirementAge, double currentBalance, double annualContribution, double annualRate, int compoundingPeriod, double contributionIncrease) {

			// Print header
			System.out.println("\n\nRetirement Growth Simulation");
			System.out.println("------------------------------");
			System.out.println("Current age: " + currentAge);
			System.out.println("Retirement age: " + retirementAge);
			System.out.printf(Current Balance: $%.2f%n", currentBalance);
			System.out.printf("Annual rate: %.2f%%%n", annualRate);

			String compoundingType = "";
			if (compoundingPeriod == ANNUALLY) compoundingType = "Annually";
			else if (compoundingPeriod == MONTHLY) compoundingType = "Monthly";
			else if (compoundingPeriod == DAILY) compoundingType = "Daily";
			System.out.println("Compounding: " + compoundingType);
			
			System.out.printf("Annual Contribution (Year 1): $%.2f%n", annualContribution);
			System.out.printf("Annual Contribution Increase: %.2f%%%n", contributionIncrease);
			
			// Print table header
			System.out.println("\nYear-by-Year Projection");
			System.out.println("----------------------------------------------------------------------------);
			System.out.println("Age / Start Balance / Contributions / Intrest Earned / End Balance");
			System.out.println("----------------------------------------------------------------------------");

			// Simulation Variables
			double balance = currentBalance;
			double totalContributions = 0.0;
			double totalInterest = 0.0;
			double currentContribution = annualcontribution;

			// Convert rates to decimals
			double rateDecimal = annualRate / 100.0;
			
		}
				}
				}
			}
		}
	}	
	 }
				}
			}
		}
	}
			}
				}
				}
			}
		}
	}

}

}
