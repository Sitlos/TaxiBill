package BillingStrategyClass;

import Context.Taxi;

public class DaytimeBilling implements BillingStrategy {

	// 单例模式 静态内部类

	private static class DaytimeBillingHolder {
		private final static BillingStrategy instance = new DaytimeBilling();
	}

	private DaytimeBilling() {
	}

	public static final BillingStrategy getInstance() {
		return DaytimeBillingHolder.instance;
	}

	@Override
	public double billing(Taxi taxi, double totalDistance) {
		// 分为起步距离前，起步距离后临界距离前,临界距离后,额外费用(等待)四部分进行计算，并返回总和
		double initiatePrice = taxi.getRule().getDaytimeInitialRate();
		double middlePartPrice = (Math.max(Math.min(totalDistance, taxi.getRule().getCriticalDistance()),
				taxi.getRule().getdaytimeMaxDistance()) - taxi.getRule().getdaytimeMaxDistance())
				* taxi.getRule().getDaytimeUnitePrice();
		double lastPartPrice = (Math.max(taxi.getRule().getCriticalDistance(), totalDistance)
				- taxi.getRule().getCriticalDistance()) * taxi.getRule().getDaytimeUnitCriticalPrice();
		return initiatePrice + middlePartPrice + lastPartPrice;
	}

}
