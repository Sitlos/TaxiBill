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

// ����ģʽ
Bill* BillFactory::getBill(std::string nowtime) {
	if (Clock::TimeType(nowtime) == false) {// ����
		return DaytimeBill::getInstance();
	}
	return NightBill::getInstance(); // ��ҹ
}
