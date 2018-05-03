#include "DaytimeBill.h"
#include<algorithm>

DaytimeBill::DaytimeBill()
{
}


DaytimeBill::~DaytimeBill()
{
}

// 单例模式

DaytimeBill DaytimeBill::instance = DaytimeBill();


Bill* DaytimeBill::getInstance() {
	return &instance;
}

double DaytimeBill::billing(Taxi taxi, double totalDistance) {
	// 分为起步距离前，起步距离后临界距离前,临界距离后,额外费用(等待)四部分进行计算，并返回总和
	double initiatePrice = taxi.getRule().getDaytimeInitialRate();
	double middlePartPrice = (std::max(std::min(totalDistance, taxi.getRule().getCriticalDistance()),
		taxi.getRule().getdaytimeMaxDistance()) - taxi.getRule().getdaytimeMaxDistance())
		* taxi.getRule().getDaytimeUnitePrice();
	double lastPartPrice = (std::max(taxi.getRule().getCriticalDistance(), totalDistance)
		- taxi.getRule().getCriticalDistance()) * taxi.getRule().getDaytimeUnitCriticalPrice();
	return initiatePrice + middlePartPrice + lastPartPrice + taxi.extra();
}
