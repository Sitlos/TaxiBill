#include "Clock.h"
#include<string>


Clock::Clock()
{
}


Clock::~Clock()
{
}

bool Clock::TimeType(std::string nowTime) {
	// �����ǰʱ�����ڰ��쿪ʼǰ�������Ͽ�ʼ��ͷ�������,���򷵻�����
	if (nowTime < RulesInfo::DAYTIME_BEGIN_TIME || nowTime >= RulesInfo::NIGHT_END_TIME)
		return true;
	return false;
}
