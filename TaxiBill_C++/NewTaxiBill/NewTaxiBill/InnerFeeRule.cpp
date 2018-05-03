#include "InnerFeeRule.h"
#include"RulesInfo.h"


InnerFeeRule::InnerFeeRule()
{
	init();
}


InnerFeeRule::~InnerFeeRule()
{
}

FeeRule InnerFeeRule::instance = InnerFeeRule();


FeeRule InnerFeeRule::getInstance() {
	return instance;
}

void InnerFeeRule::init() {
	setCriticalDistance(RulesInfo::CRITICAL_DISTANCE);
	setDaytimeInitialRate(RulesInfo::DAYTIME_INITIATE_RATE);
	setDaytimeMaxDistance(RulesInfo::DAYTIME_MAX_DISTANCE);
	setDaytimeUnitCriticalPrice(RulesInfo::INNER_DAYTIME_UNIT_PRICE);
	setDaytimeUnitePrice(RulesInfo::DAYTIME_UNIT_PRICE);
	setFeeWaitingMinutesPerYuan(RulesInfo::FEE_WAITING_MINUTES_PER_YUAN);
	setNightUnitePrice(RulesInfo::NIGHT_UNIT_PRICE);
	setNightInitialRate(RulesInfo::NIGHT_INITIATE_RATE);
	setNightMaxDistance(RulesInfo::NIGHT_MAX_DISTANCE);
	setNightUnitCriticalPrice(RulesInfo::INNER_NIGHT_UNIT_PRICE);
}
