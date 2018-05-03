#pragma once
class FeeRule
{
public:
	FeeRule();
	~FeeRule();
	// 白天起步价
	virtual void init() ;

	double getDaytimeInitialRate();

	void setDaytimeInitialRate(double daytimeInitialRate);

	double getNightInitialRate();

	void setNightInitialRate(double nightInitialRate);

	double getdaytimeMaxDistance();

	void setDaytimeMaxDistance(double daytimeMaxDistance);

	double getNightMaxDistance();

	void setNightMaxDistance(double nightMaxDistance);

	double getDaytimeUnitePrice();

	void setDaytimeUnitePrice(double daytimeUnitePrice);

	double getNightUnitePrice();

	void setNightUnitePrice(double nightUnitePrice);

	double getCriticalDistance();

	void setCriticalDistance(double criticalDistance);

	double getDaytimeUnitCriticalPrice();

	void setDaytimeUnitCriticalPrice(double daytimeUnitCriticalPrice);

	double getNightUnitCriticalPrice();

	void setNightUnitCriticalPrice(double nightUnitCriticalPrice);

	int getFeeWaitingMinutesPerYuan();

	void setFeeWaitingMinutesPerYuan(int feeWaitingMinutesPerYuan);

private:
	double daytimeInitialRate;

	// 夜间起步价
	double nightInitialRate;

	// 白天起步价最大距离
	double daytimeMaxDistance;

	// 夜间起步价最大距离
	double nightMaxDistance;

	// 白天超出起步价后单位价格
	double daytimeUnitePrice;

	// 夜间超出起步价后单位价格
	double nightUnitePrice;

	// 价格变动临界距离
	double criticalDistance;

	// 白天超出临界的价格
	double daytimeUnitCriticalPrice;

	// 夜间超临界值后单价
	double nightUnitCriticalPrice;

	// 等待时间
	int feeWaitingMinutesPerYuan;
};

