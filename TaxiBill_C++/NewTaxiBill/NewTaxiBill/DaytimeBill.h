#pragma once
#include"Taxi.h"
#include"Bill.h"
class DaytimeBill:
	public Bill
{
public:
	~DaytimeBill();
	static Bill* getInstance();
	double billing(Taxi taxi, double totalDistance);
private:
	// ����ģʽ
	static DaytimeBill instance;
	DaytimeBill();
	
};

