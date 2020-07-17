package de.tum.in.ase.eist;

import java.time.LocalDateTime;

public class Application {

	public static void main(String[] args) {
		testFromRentalStop();
		testPattern();
	}

	private static void testFromRentalStop() {
		PEV pev = new EKickscooter(100, "LicensePlate");
		DriversLicense license = new DriversLicense(LocalDateTime.now().plusYears(10), "NameOfDriver");
		Rider rider = new Rider("Name of Driver", 25, true, false, license);
		Rental rental = new Rental(LocalDateTime.now(), LocalDateTime.now().plusMinutes(123), pev, rider);

		rental.start();
		rental.stop();
	}

	private static void testPattern() {
		PEV pev = new EMoped(100, "LicensePlate");
		DriversLicense license = new DriversLicense(LocalDateTime.now().plusYears(10), "NameOfDriver");
		Rider rider = new Rider("NameOfDriver", 21, true, false, license);
		int duration = 167;
		Payment payment = new Payment(duration, pev, rider);
		Policy policy = new Policy(payment);

		policy.configure();
		payment.pay();
	}
}
