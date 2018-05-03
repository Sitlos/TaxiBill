package Context;

import BillingStrategyClass.BillingStrategy;
import RuleClass.FeeRule;

public class Taxi {
	private FeeRule rule;
	private BillingStrategy billingStrategy;
	private int waitTime;// µÈ´ýÊ±¼ä

	public Taxi(int waitTime, FeeRule rule, BillingStrategy billingStrategy) {
		this.waitTime = waitTime;
		this.rule = rule;
		this.billingStrategy = billingStrategy;
	}

	public FeeRule getRule() {
		return rule;
	}

	public double executeBilling(double distance) {
		return billingStrategy.billing(this, distance) + waitTime / rule.getFeeWaitingMinutesPerYuan();
	}

}
