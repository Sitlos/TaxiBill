package BillingStrategyClass;

import Context.Taxi;

public class NightBilling implements BillingStrategy {

	// ����ģʽ ��̬�ڲ���

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
		// ��Ϊ�𲽾���ǰ���𲽾�����ٽ����ǰ,�ٽ�����,�������(�ȴ�)�Ĳ��ֽ��м��㣬�������ܺ�
		double initiatePrice = taxi.getRule().getNightInitialRate();
		double middlePartPrice = (Math.max(Math.min(totalDistance, taxi.getRule().getCriticalDistance()),
				taxi.getRule().getNightMaxDistance()) - taxi.getRule().getNightMaxDistance())
				* taxi.getRule().getNightUnitePrice();
		double lastPartPrice = (Math.max(taxi.getRule().getCriticalDistance(), totalDistance)
				- taxi.getRule().getCriticalDistance()) * taxi.getRule().getNightUnitCriticalPrice();
		return initiatePrice + middlePartPrice + lastPartPrice;
	}

}
