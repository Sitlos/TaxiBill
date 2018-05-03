package BillingStrategyClass;

import Context.Taxi;

public class NightBilling implements BillingStrategy {

	// 单例模式 静态内部类

	private static class NightBillingHolder {
		private final static BillingStrategy instance = new NightBilling();
	}

	private NightBilling() {
	}

	public static final BillingStrategy getInstance() {
		return NightBillingHolder.instance;
	}

	@Override
	public double billing(Taxi taxi, double totalDistance) {
		// 分为起步距离前，起步距离后临界距离前,临界距离后,额外费用(等待)四部分进行计算，并返回总和
		double initiatePrice = taxi.getRule().getNightInitialRate();
		double middlePartPrice = (Math.max(Math.min(totalDistance, taxi.getRule().getCriticalDistance()),
				taxi.getRule().getNightMaxDistance()) - taxi.getRule().getNightMaxDistance())
				* taxi.getRule().getNightUnitePrice();
		double lastPartPrice = (Math.max(taxi.getRule().getCriticalDistance(), totalDistance)
				- taxi.getRule().getCriticalDistance()) * taxi.getRule().getNightUnitCriticalPrice();
		return initiatePrice + middlePartPrice + lastPartPrice;
	}

}
