package RuleClass;

public abstract class FeeRule {

	// 白天起步价
	private double daytimeInitialRate;

	// 夜间起步价
	private double nightInitialRate;

	// 白天起步价最大距离
	private double daytimeMaxDistance;

	// 夜间起步价最大距离
	private double nightMaxDistance;

	// 白天超出起步价后单位价格
	private double daytimeUnitePrice;

	// 夜间超出起步价后单位价格
	private double nightUnitePrice;

	// 价格变动临界距离
	private double criticalDistance;

	// 白天超出临界的价格
	private double daytimeUnitCriticalPrice;

	// 夜间超临界值后单价
	private double nightUnitCriticalPrice;

	// 等待时间
	private int feeWaitingMinutesPerYuan;
	
	private int ruletype;

	public abstract void init();

	public double getDaytimeInitialRate() {
		return daytimeInitialRate;
	}

	public void setDaytimeInitialRate(double daytimeInitialRate) {
		this.daytimeInitialRate = daytimeInitialRate;
	}

	public double getNightInitialRate() {
		return nightInitialRate;
	}

	public void setNightInitialRate(double nightInitialRate) {
		this.nightInitialRate = nightInitialRate;
	}

	public double getdaytimeMaxDistance() {
		return daytimeMaxDistance;
	}

	public void setDaytimeMaxDistance(double daytimeMaxDistance) {
		this.daytimeMaxDistance = daytimeMaxDistance;
	}

	public double getNightMaxDistance() {
		return nightMaxDistance;
	}

	public void setNightMaxDistance(double nightMaxDistance) {
		this.nightMaxDistance = nightMaxDistance;
	}

	public double getDaytimeUnitePrice() {
		return daytimeUnitePrice;
	}

	public void setDaytimeUnitePrice(double daytimeUnitePrice) {
		this.daytimeUnitePrice = daytimeUnitePrice;
	}

	public double getNightUnitePrice() {
		return nightUnitePrice;
	}

	public void setNightUnitePrice(double nightUnitePrice) {
		this.nightUnitePrice = nightUnitePrice;
	}

	public double getCriticalDistance() {
		return criticalDistance;
	}

	public void setCriticalDistance(double criticalDistance) {
		this.criticalDistance = criticalDistance;
	}

	public double getDaytimeUnitCriticalPrice() {
		return daytimeUnitCriticalPrice;
	}

	public void setDaytimeUnitCriticalPrice(double daytimeUnitCriticalPrice) {
		this.daytimeUnitCriticalPrice = daytimeUnitCriticalPrice;
	}

	public double getNightUnitCriticalPrice() {
		return nightUnitCriticalPrice;
	}

	public void setNightUnitCriticalPrice(double nightUnitCriticalPrice) {
		this.nightUnitCriticalPrice = nightUnitCriticalPrice;
	}

	public int getFeeWaitingMinutesPerYuan() {
		return feeWaitingMinutesPerYuan;
	}

	public void setFeeWaitingMinutesPerYuan(int feeWaitingMinutesPerYuan) {
		this.feeWaitingMinutesPerYuan = feeWaitingMinutesPerYuan;
	}
	
	public void setRuleType(int ruletype) {
		this.ruletype=ruletype;
	}
	
	public int setRuleType() {
		return ruletype;
	}
}
