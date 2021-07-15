package de.tum.in.ase.eist;

public class OneTimePayment implements PaymentStrategy{

	public void performTransaction(int amount) {
		System.out.println("Payed " + amount + " with normal payment");
	}
}
