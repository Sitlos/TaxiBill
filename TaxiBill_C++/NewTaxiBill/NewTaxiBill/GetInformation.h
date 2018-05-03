#pragma once
#include"FeeRule.h"
#include"string"
class GetInformation
{
public:
	GetInformation();
	~GetInformation();
	static double CalBillUsingInformationFromDataBase(int waitingTime, int ruleType, double distance,
		std::string nowTime);
private:
	static FeeRule initRules(int ruleType);
};

