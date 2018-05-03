#pragma once
class FeeRule
{
public:
	FeeRule();
	~FeeRule();
	// �����𲽼�
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

	// ҹ���𲽼�
	double nightInitialRate;

	// �����𲽼�������
	double daytimeMaxDistance;

	// ҹ���𲽼�������
	double nightMaxDistance;

	// ���쳬���𲽼ۺ�λ�۸�
	double daytimeUnitePrice;

	// ҹ�䳬���𲽼ۺ�λ�۸�
	double nightUnitePrice;

	// �۸�䶯�ٽ����
	double criticalDistance;

	// ���쳬���ٽ�ļ۸�
	double daytimeUnitCriticalPrice;

	// ҹ�䳬�ٽ�ֵ�󵥼�
	double nightUnitCriticalPrice;

	// �ȴ�ʱ��
	int feeWaitingMinutesPerYuan;
};

