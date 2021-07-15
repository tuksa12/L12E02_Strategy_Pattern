package de.tum.in.ase.eist;

public class PromotionalOffer implements PaymentStrategy{

	private String promoDescription;

	public PromotionalOffer(String promoDescription) {
		this.promoDescription = promoDescription;
	}

	public void performTransaction(int amount) {
		System.out.println("Applied promotional offer \"" + promoDescription + "\" and saved " + amount + " EUR.");
	}

	public static String getTimeString() {
		return "Rides under 60 seconds are free";
	}

	public static String getBikeString() {
		return "Please consider using our bikes in the future";
	}
}
