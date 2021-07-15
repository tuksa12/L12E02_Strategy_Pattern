package de.tum.in.ase.eist;

public class Subscription implements PaymentStrategy {

	public void performTransaction(int amount) {
		System.out.println("Used subscription for a ride that costs " + amount);
	}
}
