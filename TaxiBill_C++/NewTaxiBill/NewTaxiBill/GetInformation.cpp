#include "GetInformation.h"
#include"InnerFeeRule.h"
#include"OuterFeeRule.h"
#include"Taxi.h"
#include"Bill.h"
#include<string>
#include"BillFactory.h"


GetInformation::GetInformation()
{
}

GetInformation::~GetInformation()
{
}

// 模拟从数据库的信息获取过程
// 可以在RulesInfo处更改从database的信息
FeeRule GetInformation::initRules(int ruleType) {
	// 1表示内环车
	// 2表示外环车
	if (ruleType == 1) {
		return InnerFeeRule::getInstance();
	}
	else  return OuterFeeRule::getInstance();
}

// 等待时间 规则类型(内环：外环) 行驶距离 当前时间
double GetInformation::CalBillUsingInformationFromDataBase(int waitingTime, int ruleType, double distance,
	std::string nowTime) {
	FeeRule rule = initRules(ruleType);
	Taxi taxi = Taxi(waitingTime, rule);
	Bill* bill = BillFactory::getBill(nowTime);
	return bill->billing(taxi, distance);
}
