#include "DaytimeBill.h"
#include<algorithm>

DaytimeBill::DaytimeBill()
{
}


DaytimeBill::~DaytimeBill()
{
}

// ����ģʽ

DaytimeBill DaytimeBill::instance = DaytimeBill();


Bill* DaytimeBill::getInstance() {
	return &instance;
}

double DaytimeBill::billing(Taxi taxi, double totalDistance) {
	// ��Ϊ�𲽾���ǰ���𲽾�����ٽ����ǰ,�ٽ�����,�������(�ȴ�)�Ĳ��ֽ��м��㣬�������ܺ�
	double initiatePrice = taxi.getRule().getDaytimeInitialRate();
	double middlePartPrice = (std::max(std::min(totalDistance, taxi.getRule().getCriticalDistance()),
		taxi.getRule().getdaytimeMaxDistance()) - taxi.getRule().getdaytimeMaxDistance())
		* taxi.getRule().getDaytimeUnitePrice();
	double lastPartPrice = (std::max(taxi.getRule().getCriticalDistance(), totalDistance)
		- taxi.getRule().getCriticalDistance()) * taxi.getRule().getDaytimeUnitCriticalPrice();
	return initiatePrice + middlePartPrice + lastPartPrice + taxi.extra();
}
