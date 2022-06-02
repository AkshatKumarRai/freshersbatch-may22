package com.capgemini.oops;

public abstract class DessertItem {
	protected String name;

	public DessertItem() {
		this("");
	}

	public DessertItem(String name) {
		if (name.length() <= DessertShop.MAX_ITEM_NAME_SIZE)
			this.name = name;
		else
			this.name = name.substring(0, DessertShop.MAX_ITEM_NAME_SIZE);
	}

	public final String getName() {
		return name;
	}

	public abstract int getCost();
}
