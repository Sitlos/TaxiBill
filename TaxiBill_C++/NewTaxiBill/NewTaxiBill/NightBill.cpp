#include "NightBill.h"
#include<algorithm>

NightBill::NightBill()
{
}


NightBill::~NightBill()
{
}

// ����ģʽ

NightBill NightBill::instance = NightBill();


Bill* NightBill::getInstance() {
	return &instance;
}

double NightBill::billing(Taxi taxi, double totalDistance) {
	// ��Ϊ�𲽾���ǰ���𲽾�����ٽ����ǰ,�ٽ�����,�������(�ȴ�)�Ĳ��ֽ��м��㣬�������ܺ�
	double initiatePrice = taxi.getRule().getNightInitialRate();
	double middlePartPrice = (std::max(std::min(totalDistance, taxi.getRule().getCriticalDistance()),
		taxi.getRule().getNightMaxDistance()) - taxi.getRule().getNightMaxDistance())
		* taxi.getRule().getNightUnitePrice();
	double lastPartPrice = (std::max(taxi.getRule().getCriticalDistance(), totalDistance)
		- taxi.getRule().getCriticalDistance()) * taxi.getRule().getNightUnitCriticalPrice();
	return initiatePrice + middlePartPrice + lastPartPrice + taxi.extra();
}