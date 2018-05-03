package BillingStrategyClass;

import Context.Taxi;

public class DaytimeBilling implements BillingStrategy {

	// ����ģʽ ��̬�ڲ���

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
		// ��Ϊ�𲽾���ǰ���𲽾�����ٽ����ǰ,�ٽ�����,�������(�ȴ�)�Ĳ��ֽ��м��㣬�������ܺ�
		double initiatePrice = taxi.getRule().getDaytimeInitialRate();
		double middlePartPrice = (Math.max(Math.min(totalDistance, taxi.getRule().getCriticalDistance()),
				taxi.getRule().getdaytimeMaxDistance()) - taxi.getRule().getdaytimeMaxDistance())
				* taxi.getRule().getDaytimeUnitePrice();
		double lastPartPrice = (Math.max(taxi.getRule().getCriticalDistance(), totalDistance)
				- taxi.getRule().getCriticalDistance()) * taxi.getRule().getDaytimeUnitCriticalPrice();
		return initiatePrice + middlePartPrice + lastPartPrice;
	}

}
