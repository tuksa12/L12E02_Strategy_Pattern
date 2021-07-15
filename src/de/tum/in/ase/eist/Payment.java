package de.tum.in.ase.eist;

public class Payment {

	private long durationInSeconds;
	private PEV pev;
	private Rider rider;
	private PaymentStrategy paymentStrategy;

	public Payment(long durationInSeconds, PEV pev, Rider rider) {
		this.durationInSeconds = durationInSeconds;
		this.pev = pev;
		this.rider = rider;
	}

	public long getDurationInSeconds() {
		return durationInSeconds;
	}

	public PEV getPEV() {
		return pev;
	}

	public Rider getRider() {
		return rider;
	}

	public void pay() {
		// DONE add some functionality here
		int amountToPay = getPEV().calculatePrice(durationInSeconds);

		if (pev.getClass().equals(EBike.class) || durationInSeconds < 60) {
			paymentStrategy = new PromotionalOffer("FreeRide");
			paymentStrategy.performTransaction(amountToPay);
			System.out.println(PromotionalOffer.getTimeString());
			System.out.println(PromotionalOffer.getBikeString());
		} else if (rider.hasSubscription()) {
			paymentStrategy = new Subscription();
			paymentStrategy.performTransaction(amountToPay);
		} else {
			if (durationInSeconds > 10800) {//10800 seconds = 3 hours
				rider.setSubscription(true);
				paymentStrategy = new Subscription();
			} else {
				paymentStrategy = new OneTimePayment();
			}
			paymentStrategy.performTransaction(amountToPay);
		}
	}
}
