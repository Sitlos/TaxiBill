#pragma once
#include"RulesInfo.h"
#include<string>
class Clock
{
public:
	Clock();
	~Clock();
	// 得到当前时间的类型
	static bool TimeType(std::string nowTime);
		
};

