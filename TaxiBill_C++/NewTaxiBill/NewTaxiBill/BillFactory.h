#pragma once
#include"Bill.h"
#include<string>
#include"Clock.h"
#include"DaytimeBill.h"
#include"NightBill.h"
class BillFactory
{
public:
	BillFactory();
	~BillFactory();
	// 工厂模式
	static Bill* getBill(std::string nowtime);
};

