package com.capgemini.oops;

public class Checkout {
	protected int size;
	protected DessertItem[] dessertItems;
	protected int amount;
	protected int sum;
	protected final double taxRate;

	Checkout() {
		size = 100;
		dessertItems = new DessertItem[size];
		amount = 0;
		sum = 0;
		taxRate = DessertShop.TAX_RATE;
	}

	public void enterItem(DessertItem d) {
		dessertItems[amount] = d;
		amount++;
	}

	public int numberOfItems() {
		return amount;
	}

	public int totalCost() {
		// make sum into zero, and calculate price from every item
		sum = 0;
		for (int i = 0; i < amount; i++) {
			sum += dessertItems[i].getCost();
		}
		return sum;
	}

	public int totalTax() {
		// use the totalCost method
		return (int) (Math.round(this.totalCost() * taxRate / 100));
	}

	public void clear() {
		// clear the array
		for (DessertItem d : dessertItems) {
			d = null;
		}
		amount = 0;
		sum = 0;
	}

	public String toString() {
		String result = "Thank You! \n";

		result += DessertShop.STORE_NAME + "\n";

		result += "Purchased: ";

		String totalPay = DessertShop.cents2dollarsAndCents(totalCost() + totalTax());
		if (totalPay.length() > DessertShop.COST_WIDTH) {
			totalPay = totalPay.substring(0, DessertShop.COST_WIDTH);
		}
		result += "$" + totalPay;
		return result;
	}
}
