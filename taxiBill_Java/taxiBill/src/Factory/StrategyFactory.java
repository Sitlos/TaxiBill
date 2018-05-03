package Factory;

import BillingStrategyClass.BillingStrategy;
import BillingStrategyClass.DaytimeBilling;
import BillingStrategyClass.NightBilling;
import RelativeClass.Clock;

public class StrategyFactory {

	// 单例模式 静态外部类
	private static class StrategyFactoryHolder {
		private final static StrategyFactory instance = new StrategyFactory();
	}

	private StrategyFactory() {
	}

	public static final StrategyFactory getInstance() {
		return StrategyFactoryHolder.instance;
	}

	public BillingStrategy createStrategy(String nowtime) {
		if (Clock.TimeType(nowtime))
			return NightBilling.getInstance();
		return DaytimeBilling.getInstance();
	}

}
