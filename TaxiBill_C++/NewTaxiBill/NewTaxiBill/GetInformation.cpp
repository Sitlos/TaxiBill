#include "GetInformation.h"
#include"InnerFeeRule.h"
#include"OuterFeeRule.h"
#include"Taxi.h"
#include"Bill.h"
#include<string>
#include"BillFactory.h"


GetInformation::GetInformation()
{
}

GetInformation::~GetInformation()
{
}

// ģ������ݿ����Ϣ��ȡ����
// ������RulesInfo�����Ĵ�database����Ϣ
FeeRule GetInformation::initRules(int ruleType) {
	// 1��ʾ�ڻ���
	// 2��ʾ�⻷��
	if (ruleType == 1) {
		return InnerFeeRule::getInstance();
	}
	else  return OuterFeeRule::getInstance();
}

// �ȴ�ʱ�� ��������(�ڻ����⻷) ��ʻ���� ��ǰʱ��
double GetInformation::CalBillUsingInformationFromDataBase(int waitingTime, int ruleType, double distance,
	std::string nowTime) {
	FeeRule rule = initRules(ruleType);
	Taxi taxi = Taxi(waitingTime, rule);
	Bill* bill = BillFactory::getBill(nowTime);
	return bill->billing(taxi, distance);
}
