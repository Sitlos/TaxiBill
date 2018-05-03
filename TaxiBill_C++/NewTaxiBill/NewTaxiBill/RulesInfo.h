#pragma once
#include<string>

class RulesInfo
{
public:
	RulesInfo();
	~RulesInfo();

	// 白天的起步价
	static double DAYTIME_INITIATE_RATE;
	// 晚上的起步价
	static double NIGHT_INITIATE_RATE;
	// 白天起步价最大距离
	static double DAYTIME_MAX_DISTANCE;
	// 夜间起步价最大距离
	static double NIGHT_MAX_DISTANCE;
	// 白天超出起步价后单位价格
	static double DAYTIME_UNIT_PRICE;
	// 夜间超出起步价后单位价格
	static double NIGHT_UNIT_PRICE;
	// 价格变动临界距离
	static double CRITICAL_DISTANCE;
	// 内环白天超出临界的价格
	static double INNER_DAYTIME_UNIT_PRICE;
	// 内环夜晚超出临界的价格
	static double INNER_NIGHT_UNIT_PRICE;
	// 外环白天超出临界的价格
	static double OUTER_DAYTIME_UNIT_PRICE;
	// 外环夜晚超出临界的价格
	static double OUTER_NIGHT_UNIT_PRICE;
	// 等待多久一元钱
	static int FEE_WAITING_MINUTES_PER_YUAN;
	// 晚上的最后一刻
	static std::string DAYTIME_BEGIN_TIME;
	// 白天的最后一刻
	static std::string NIGHT_END_TIME;
};
