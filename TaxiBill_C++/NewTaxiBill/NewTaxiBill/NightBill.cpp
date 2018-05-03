#include "NightBill.h"
#include<algorithm>

NightBill::NightBill()
{
}


NightBill::~NightBill()
{
}

// 单例模式

NightBill NightBill::instance = NightBill();


Bill* NightBill::getInstance() {
	return &instance;
}

double NightBill::billing(Taxi taxi, double totalDistance) {
	// 分为起步距离前，起步距离后临界距离前,临界距离后,额外费用(等待)四部分进行计算，并返回总和
	double initiatePrice = taxi.getRule().getNightInitialRate();
	double middlePartPrice = (std::max(std::min(totalDistance, taxi.getRule().getCriticalDistance()),
		taxi.getRule().getNightMaxDistance()) - taxi.getRule().getNightMaxDistance())
		* taxi.getRule().getNightUnitePrice();
	double lastPartPrice = (std::max(taxi.getRule().getCriticalDistance(), totalDistance)
		- taxi.getRule().getCriticalDistance()) * taxi.getRule().getNightUnitCriticalPrice();
	return initiatePrice + middlePartPrice + lastPartPrice + taxi.extra();
}