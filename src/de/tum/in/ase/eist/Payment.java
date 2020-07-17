package de.tum.in.ase.eist;

public class Payment {

	private long durationInSeconds;
	private PEV pev;
	private Rider rider;

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
		// TODO add some functionality here
	}
}
