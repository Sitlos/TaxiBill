package RuleClass;

import Constant.RulesInfo;

public class OuterFeeRule extends FeeRule {

	// 单例模式 静态内部类

	private static class OuterFeeRuleHolder {
		private final static FeeRule instance = new OuterFeeRule();
	}
	
	private OuterFeeRule() {
		init();
	}
	
	public static final FeeRule getInstance() {
		return OuterFeeRuleHolder.instance;
	}

	@Override
	public void init() {
		setRuleType(2);//设置类型为外环类型
		setCriticalDistance(RulesInfo.CRITICAL_DISTANCE);
		setDaytimeInitialRate(RulesInfo.DAYTIME_INITIATE_RATE);
		setDaytimeMaxDistance(RulesInfo.DAYTIME_MAX_DISTANCE);
		setDaytimeUnitCriticalPrice(RulesInfo.OUTER_DAYTIME_UNIT_PRICE);
		setDaytimeUnitePrice(RulesInfo.DAYTIME_UNIT_PRICE);
		setFeeWaitingMinutesPerYuan(RulesInfo.FEE_WAITING_MINUTES_PER_YUAN);
		setNightUnitePrice(RulesInfo.NIGHT_UNIT_PRICE);
		setNightInitialRate(RulesInfo.NIGHT_INITIATE_RATE);
		setNightMaxDistance(RulesInfo.NIGHT_MAX_DISTANCE);
		setNightUnitCriticalPrice(RulesInfo.OUTER_NIGHT_UNIT_PRICE);
	}
}
