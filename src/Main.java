import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creating calculator
		System.out.println("Welcome to the tip calculator!");

		System.out.print("How many people are in your group? ");
		int numPeople = scanner.nextInt();

		System.out.print("What's the tip percentage (0 - 100)? ");
		int tipPercentage = scanner.nextInt();

		TipCalculator calc = new TipCalculator(numPeople, tipPercentage);

		// Adding costs
		while (true) {
			System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
			double cost = scanner.nextDouble();
			if (cost == -1)
				break;
			calc.addMeal(cost);
		}

		// Printing results
		DecimalFormat fmt = new DecimalFormat("0.00");

		System.out.println("-----------------------------------");
		System.out.println("Total Bill Before Tip: " + fmt.format(calc.getTotalBillBeforeTip()));
		System.out.println("Tip Percentage: " + calc.getTipPercentage());

		System.out.println("Total Tip: " + fmt.format(calc.tipAmount()));
		System.out.println("Total Bill With Tip: " + fmt.format(calc.totalBill()));

		System.out.println("Per Person Cost Before Tip: " + fmt.format(calc.perPersonCostBeforeTip()));
		System.out.println("Tip Per Person: " + fmt.format(calc.perPersonTipAmount()));
		System.out.println("Total Cost Per Person: " + fmt.format(calc.perPersonTotalCost()));
	}
}
