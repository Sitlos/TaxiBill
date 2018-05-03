#include "RulesInfo.h"



RulesInfo::RulesInfo()
{
}


RulesInfo::~RulesInfo()
{
}

// ������𲽼�
double RulesInfo::DAYTIME_INITIATE_RATE = 14.0;
// ���ϵ��𲽼�
double RulesInfo::NIGHT_INITIATE_RATE = 18.0;
// �����𲽼�������
double RulesInfo::DAYTIME_MAX_DISTANCE = 3.0;
// ҹ���𲽼�������
double RulesInfo::NIGHT_MAX_DISTANCE = 3.0;
// ���쳬���𲽼ۺ�λ�۸�
double RulesInfo::DAYTIME_UNIT_PRICE = 2.5;
// ҹ�䳬���𲽼ۺ�λ�۸�
double RulesInfo::NIGHT_UNIT_PRICE = 3.0;
// �۸�䶯�ٽ����
double RulesInfo::CRITICAL_DISTANCE = 10.0;
// �ڻ����쳬���ٽ�ļ۸�
double RulesInfo::INNER_DAYTIME_UNIT_PRICE = 3.5;
// �ڻ�ҹ�����ٽ�ļ۸�
double RulesInfo::INNER_NIGHT_UNIT_PRICE = 4.7;
// �⻷���쳬���ٽ�ļ۸�
double RulesInfo::OUTER_DAYTIME_UNIT_PRICE = 2.5;
// �⻷ҹ�����ٽ�ļ۸�
double RulesInfo::OUTER_NIGHT_UNIT_PRICE = 3.0;
// �ȴ����һԪǮ
int RulesInfo::FEE_WAITING_MINUTES_PER_YUAN = 10;
// ���ϵ����һ��
std::string RulesInfo::DAYTIME_BEGIN_TIME = "06:00";
// ��������һ��
std::string RulesInfo::NIGHT_END_TIME = "23:00";
