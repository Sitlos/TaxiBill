package RuleClass;

public abstract class FeeRule {

	// �����𲽼�
	private double daytimeInitialRate;

	// ҹ���𲽼�
	private double nightInitialRate;

	// �����𲽼�������
	private double daytimeMaxDistance;

	// ҹ���𲽼�������
	private double nightMaxDistance;

	// ���쳬���𲽼ۺ�λ�۸�
	private double daytimeUnitePrice;

	// ҹ�䳬���𲽼ۺ�λ�۸�
	private double nightUnitePrice;

	// �۸�䶯�ٽ����
	private double criticalDistance;

	// ���쳬���ٽ�ļ۸�
	private double daytimeUnitCriticalPrice;

	// ҹ�䳬�ٽ�ֵ�󵥼�
	private double nightUnitCriticalPrice;

	// �ȴ�ʱ��
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
