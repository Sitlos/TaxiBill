#pragma once
#include "FeeRule.h"
class OuterFeeRule :
	public FeeRule
{
public:
	~OuterFeeRule();
	static FeeRule getInstance();
private:
	static FeeRule instance;// ����ģʽ
	OuterFeeRule();
	void init() override;
};

