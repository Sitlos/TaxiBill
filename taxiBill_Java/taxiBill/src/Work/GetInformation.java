package Work;

import Context.Taxi;
import Factory.StrategyFactory;
import RuleClass.FeeRule;
import RuleClass.InnerFeeRule;
import RuleClass.OuterFeeRule;

public class GetInformation {
	// 模拟从数据库的信息获取过程
	// 可以在RulesInfo处更改从database的信息
	private static FeeRule initRules(int ruleType) {
		// 1表示内环车
		// 2表示外环车
		if (ruleType == 1) {
			return InnerFeeRule.getInstance();
		} else if (ruleType == 2) {
			return OuterFeeRule.getInstance();
		}
		return null;
	}

	// 等待时间 规则类型(内环：外环) 行驶距离 当前时间
	public static double CalBillUsingInformationFromDataBase(int waitingTime, int ruleType, double distance,
			String nowtime) {
		FeeRule rule = initRules(ruleType);
		Taxi taxi = new Taxi(waitingTime, rule, StrategyFactory.getInstance().createStrategy(nowtime));
		return taxi.executeBilling(distance);
	}
}
