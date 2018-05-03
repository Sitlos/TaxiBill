#pragma once
#include "FeeRule.h"
class OuterFeeRule :
	public FeeRule
{
public:
	~OuterFeeRule();
	static FeeRule getInstance();
private:
	static FeeRule instance;// µ¥ÀýÄ£Ê½
	OuterFeeRule();
	void init() override;
};

