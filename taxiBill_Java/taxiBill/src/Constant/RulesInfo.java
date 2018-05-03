package Constant;

public final class RulesInfo {
	// 白天的起步价
	public final static double DAYTIME_INITIATE_RATE = 14.0;
	// 晚上的起步价
	public final static double NIGHT_INITIATE_RATE = 18.0;
	// 白天起步价最大距离
	public final static double DAYTIME_MAX_DISTANCE = 3.0;
	// 夜间起步价最大距离
	public final static double NIGHT_MAX_DISTANCE = 3.0;
	// 白天超出起步价后单位价格
	public final static double DAYTIME_UNIT_PRICE = 2.5;
	// 夜间超出起步价后单位价格
	public final static double NIGHT_UNIT_PRICE = 3.0;
	// 价格变动临界距离
	public final static double CRITICAL_DISTANCE = 10.0;
	// 内环白天超出临界的价格
	public final static double INNER_DAYTIME_UNIT_PRICE = 3.5;
	// 内环夜晚超出临界的价格
	public final static double INNER_NIGHT_UNIT_PRICE = 4.7;
	// 外环白天超出临界的价格
	public final static double OUTER_DAYTIME_UNIT_PRICE = 2.5;
	// 外环夜晚超出临界的价格
	public final static double OUTER_NIGHT_UNIT_PRICE = 3.0;
	// 等待多久一元钱
	public final static int FEE_WAITING_MINUTES_PER_YUAN = 10;
	// 晚上的最后一刻
	public final static String DAYTIME_BEGIN_TIME = "06:00";
	// 白天的最后一刻
	public final static String NIGHT_END_TIME = "23:00";
}
