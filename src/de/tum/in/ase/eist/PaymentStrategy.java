package de.tum.in.ase.eist;

public interface PaymentStrategy {
    void performTransaction(int amount);
}
