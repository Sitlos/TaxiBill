#include "OuterFeeRule.h"
#include"RulesInfo.h"



OuterFeeRule::OuterFeeRule()
{
	init();
}


OuterFeeRule::~OuterFeeRule()
{
}

FeeRule OuterFeeRule::getInstance() {
	return OuterFeeRule::instance;
}

FeeRule OuterFeeRule::instance = OuterFeeRule();


void OuterFeeRule::init() {
	setCriticalDistance(RulesInfo::CRITICAL_DISTANCE);
	setDaytimeInitialRate(RulesInfo::DAYTIME_INITIATE_RATE);
	setDaytimeMaxDistance(RulesInfo::DAYTIME_MAX_DISTANCE);
	setDaytimeUnitCriticalPrice(RulesInfo::OUTER_DAYTIME_UNIT_PRICE);
	setDaytimeUnitePrice(RulesInfo::DAYTIME_UNIT_PRICE);
	setFeeWaitingMinutesPerYuan(RulesInfo::FEE_WAITING_MINUTES_PER_YUAN);
	setNightUnitePrice(RulesInfo::NIGHT_UNIT_PRICE);
	setNightInitialRate(RulesInfo::NIGHT_INITIATE_RATE);
	setNightMaxDistance(RulesInfo::NIGHT_MAX_DISTANCE);
	setNightUnitCriticalPrice(RulesInfo::OUTER_NIGHT_UNIT_PRICE);
}
