package RuleClass;

import Constant.RulesInfo;

public class InnerFeeRule extends FeeRule {

	// 单例模式 静态内部类

	private static class InnerFeeRuleHolder {
		private final static FeeRule instance = new InnerFeeRule();
	}

	private InnerFeeRule() {
		init();
	}

	public static final FeeRule getInstance() {
		return InnerFeeRuleHolder.instance;
	}

	@Override
	public void init() {
		setRuleType(1);//设置类型为内环类型
		setCriticalDistance(RulesInfo.CRITICAL_DISTANCE);
		setDaytimeInitialRate(RulesInfo.DAYTIME_INITIATE_RATE);
		setDaytimeMaxDistance(RulesInfo.DAYTIME_MAX_DISTANCE);
		setDaytimeUnitCriticalPrice(RulesInfo.INNER_DAYTIME_UNIT_PRICE);
		setDaytimeUnitePrice(RulesInfo.DAYTIME_UNIT_PRICE);
		setFeeWaitingMinutesPerYuan(RulesInfo.FEE_WAITING_MINUTES_PER_YUAN);
		setNightUnitePrice(RulesInfo.NIGHT_UNIT_PRICE);
		setNightInitialRate(RulesInfo.NIGHT_INITIATE_RATE);
		setNightMaxDistance(RulesInfo.NIGHT_MAX_DISTANCE);
		setNightUnitCriticalPrice(RulesInfo.INNER_NIGHT_UNIT_PRICE);
	}
}
