public class TipCalculator {
	// instance variables
	private double totalBillBeforeTip;
	private int tipPercentage;
	private int numPeople;

	// constructors
	public TipCalculator(int numPeople, int tipPercentage) {
		this.totalBillBeforeTip = 0.0;
		this.tipPercentage = tipPercentage;
		this.numPeople = numPeople;
	}

	// getters
	public double getTotalBillBeforeTip() { return totalBillBeforeTip; }
	public int getTipPercentage() { return tipPercentage; }

	// methods
	public void addMeal(double cost) {
		totalBillBeforeTip += cost;
	}

	public double tipAmount() { // tip
		return totalBillBeforeTip * (tipPercentage / 100.0);
	}

	public double totalBill() { // bill + tip
		return totalBillBeforeTip + tipAmount();
	}

	public double perPersonCostBeforeTip() { // bill/person
		return totalBillBeforeTip / numPeople;
	}

	public double perPersonTipAmount() { // tip/person
		return tipAmount() / numPeople;
	}

	public double perPersonTotalCost() { // (bill + tip)/person
		return totalBill() / numPeople;
	}
}
