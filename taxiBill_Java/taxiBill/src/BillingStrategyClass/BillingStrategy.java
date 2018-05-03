package BillingStrategyClass;

import Context.Taxi;

public interface BillingStrategy {
	public double billing(Taxi taxi, double distance);
}
