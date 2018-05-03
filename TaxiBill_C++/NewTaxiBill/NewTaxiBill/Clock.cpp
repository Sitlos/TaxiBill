#include "Clock.h"
#include<string>


Clock::Clock()
{
}


Clock::~Clock()
{
}

bool Clock::TimeType(std::string nowTime) {
	// 如果当前时刻是在白天开始前或者晚上开始后就返回晚上,否则返回早上
	if (nowTime < RulesInfo::DAYTIME_BEGIN_TIME || nowTime >= RulesInfo::NIGHT_END_TIME)
		return true;
	return false;
}
