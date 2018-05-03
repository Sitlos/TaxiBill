#include "BillFactory.h"
#include"DaytimeBill.h"
#include"Clock.h"
#include"NightBill.h"
#include"FeeRule.h"


BillFactory::BillFactory()
{
}


BillFactory::~BillFactory()
{
}

// 工厂模式
Bill* BillFactory::getBill(std::string nowtime) {
	if (Clock::TimeType(nowtime) == false) {// 白天
		return DaytimeBill::getInstance();
	}
	return NightBill::getInstance(); // 黑夜
}
