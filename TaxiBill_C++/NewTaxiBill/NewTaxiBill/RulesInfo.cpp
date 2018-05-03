#include "RulesInfo.h"



RulesInfo::RulesInfo()
{
}


RulesInfo::~RulesInfo()
{
}

// 白天的起步价
double RulesInfo::DAYTIME_INITIATE_RATE = 14.0;
// 晚上的起步价
double RulesInfo::NIGHT_INITIATE_RATE = 18.0;
// 白天起步价最大距离
double RulesInfo::DAYTIME_MAX_DISTANCE = 3.0;
// 夜间起步价最大距离
double RulesInfo::NIGHT_MAX_DISTANCE = 3.0;
// 白天超出起步价后单位价格
double RulesInfo::DAYTIME_UNIT_PRICE = 2.5;
// 夜间超出起步价后单位价格
double RulesInfo::NIGHT_UNIT_PRICE = 3.0;
// 价格变动临界距离
double RulesInfo::CRITICAL_DISTANCE = 10.0;
// 内环白天超出临界的价格
double RulesInfo::INNER_DAYTIME_UNIT_PRICE = 3.5;
// 内环夜晚超出临界的价格
double RulesInfo::INNER_NIGHT_UNIT_PRICE = 4.7;
// 外环白天超出临界的价格
double RulesInfo::OUTER_DAYTIME_UNIT_PRICE = 2.5;
// 外环夜晚超出临界的价格
double RulesInfo::OUTER_NIGHT_UNIT_PRICE = 3.0;
// 等待多久一元钱
int RulesInfo::FEE_WAITING_MINUTES_PER_YUAN = 10;
// 晚上的最后一刻
std::string RulesInfo::DAYTIME_BEGIN_TIME = "06:00";
// 白天的最后一刻
std::string RulesInfo::NIGHT_END_TIME = "23:00";
