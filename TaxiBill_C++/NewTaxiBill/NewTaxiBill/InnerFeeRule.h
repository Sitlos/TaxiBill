#pragma once
#include "FeeRule.h"
class InnerFeeRule :
	public FeeRule
{
public:
	~InnerFeeRule();
	static FeeRule getInstance();
private:
	static FeeRule instance;// ����ģʽ
	InnerFeeRule();
	void init() override;
};

