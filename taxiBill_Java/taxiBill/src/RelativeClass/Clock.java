package RelativeClass;

import Constant.RulesInfo;

public class Clock {

	// �õ���ǰʱ�������
	public static boolean TimeType(String nowTime) {
		// �����ǰʱ�����ڰ��쿪ʼǰ�������Ͽ�ʼ��ͷ�������,���򷵻�����
		if (nowTime.compareTo(RulesInfo.DAYTIME_BEGIN_TIME) < 0 || nowTime.compareTo(RulesInfo.NIGHT_END_TIME) >= 0)
			return true;
		return false;
	}
}
