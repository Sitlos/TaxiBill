package RelativeClass;

import Constant.RulesInfo;

public class Clock {

	// 得到当前时间的类型
	public static boolean TimeType(String nowTime) {
		// 如果当前时刻是在白天开始前或者晚上开始后就返回晚上,否则返回早上
		if (nowTime.compareTo(RulesInfo.DAYTIME_BEGIN_TIME) < 0 || nowTime.compareTo(RulesInfo.NIGHT_END_TIME) >= 0)
			return true;
		return false;
	}
}
