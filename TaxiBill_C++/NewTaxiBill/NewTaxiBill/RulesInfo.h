#pragma once
#include<string>

class RulesInfo
{
public:
	RulesInfo();
	~RulesInfo();

	// ������𲽼�
	static double DAYTIME_INITIATE_RATE;
	// ���ϵ��𲽼�
	static double NIGHT_INITIATE_RATE;
	// �����𲽼�������
	static double DAYTIME_MAX_DISTANCE;
	// ҹ���𲽼�������
	static double NIGHT_MAX_DISTANCE;
	// ���쳬���𲽼ۺ�λ�۸�
	static double DAYTIME_UNIT_PRICE;
	// ҹ�䳬���𲽼ۺ�λ�۸�
	static double NIGHT_UNIT_PRICE;
	// �۸�䶯�ٽ����
	static double CRITICAL_DISTANCE;
	// �ڻ����쳬���ٽ�ļ۸�
	static double INNER_DAYTIME_UNIT_PRICE;
	// �ڻ�ҹ�����ٽ�ļ۸�
	static double INNER_NIGHT_UNIT_PRICE;
	// �⻷���쳬���ٽ�ļ۸�
	static double OUTER_DAYTIME_UNIT_PRICE;
	// �⻷ҹ�����ٽ�ļ۸�
	static double OUTER_NIGHT_UNIT_PRICE;
	// �ȴ����һԪǮ
	static int FEE_WAITING_MINUTES_PER_YUAN;
	// ���ϵ����һ��
	static std::string DAYTIME_BEGIN_TIME;
	// ��������һ��
	static std::string NIGHT_END_TIME;
};
