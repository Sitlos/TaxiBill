package Work;

import Context.Taxi;
import Factory.StrategyFactory;
import RuleClass.FeeRule;
import RuleClass.InnerFeeRule;
import RuleClass.OuterFeeRule;

public class GetInformation {
	// ģ������ݿ����Ϣ��ȡ����
	// ������RulesInfo�����Ĵ�database����Ϣ
	private static FeeRule initRules(int ruleType) {
		// 1��ʾ�ڻ���
		// 2��ʾ�⻷��
		if (ruleType == 1) {
			return InnerFeeRule.getInstance();
		} else if (ruleType == 2) {
			return OuterFeeRule.getInstance();
		}
		return null;
	}

	// �ȴ�ʱ�� ��������(�ڻ����⻷) ��ʻ���� ��ǰʱ��
	public static double CalBillUsingInformationFromDataBase(int waitingTime, int ruleType, double distance,
			String nowtime) {
		FeeRule rule = initRules(ruleType);
		Taxi taxi = new Taxi(waitingTime, rule, StrategyFactory.getInstance().createStrategy(nowtime));
		return taxi.executeBilling(distance);
	}
}
