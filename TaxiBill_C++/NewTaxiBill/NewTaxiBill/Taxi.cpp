#include "Taxi.h"

Taxi::Taxi(int waitTime, FeeRule rule) {
	this->waitTime = waitTime;
	this->rule = rule;
}

Taxi::~Taxi()
{
}

FeeRule Taxi::getRule() {
	return rule;
}

int Taxi::getWaitTime() {
	return waitTime;
}

int Taxi::extra() {
	return waitTime / rule.getFeeWaitingMinutesPerYuan();
}
