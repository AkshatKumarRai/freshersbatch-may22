package com.capgemini.oops;

public class Icecream extends DessertItem {
	protected int cost;

	public Icecream(String _n, int _cost) {
		super(_n);
		cost = _cost;
	}

	public int getCost() {
		return cost;
	}
}
