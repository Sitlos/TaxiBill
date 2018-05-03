#pragma once
#include"Bill.h"
#include"Taxi.h"
class NightBill:
	public Bill
{
public:
	~NightBill();
	static Bill* getInstance();
	double billing(Taxi taxi, double totalDistance);
private:
	// µ¥ÀýÄ£Ê½
	static NightBill instance;
	NightBill();
};

