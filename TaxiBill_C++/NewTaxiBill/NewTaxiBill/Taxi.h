#pragma once
#include"FeeRule.h"
class Taxi
{
private:
	FeeRule rule;

	int waitTime;// �ȴ�ʱ��
public:
	Taxi(int waitTime, FeeRule rule);

	FeeRule getRule();

	int getWaitTime();

	int extra();

	~Taxi();
};

