package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Work.GetInformation;

class BillTestCase {

	// ���ļ�����������Ų��Գ�����ȷ�Ե�����

	@Test
	public void testInnerNightShortDistance_case1() { // �ڻ������£�ҹ���;
		/*
		 * case 1: �Ʒ�·��Ϊ2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 2.7, "5:30");
		Assert.assertEquals(18.0, fee, 0.0);
	}

	@Test
	public void testInnerNightMediumDistance_case2() { // �ڻ������£�ҹ����;
		/*
		 * case 2: �Ʒ�·��Ϊ9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 9, "5:30");
		Assert.assertEquals(36.0, fee, 0.0);
	}

	@Test
	public void testInnerNightLongDistance_case3() { // �ڻ������£�ҹ�䳤;
		/*
		 * case 3: �Ʒ�·��Ϊ11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 11, "5:30");
		Assert.assertEquals(43.7, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeShortDistance_case4() { // �ڻ������£������;
		/*
		 * case 4: �Ʒ�·��Ϊ2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 2.7, "11:30");
		Assert.assertEquals(14.0, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeMediumDistance_case5() { // �ڻ������£�������;
		/*
		 * case 5: �Ʒ�·��9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 9, "11:30");
		Assert.assertEquals(29.0, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeLongDistance_case6() { // �ڻ������£����쳤;
		/*
		 * case 6: �Ʒ�·��11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 11, "11:30");
		Assert.assertEquals(35.0, fee, 0.0);
	}

	@Test
	public void testOuterNightShortDistance_case1() { // �⻷�����£�ҹ���;
		/*
		 * case 1: �Ʒ�·��Ϊ2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 2.7, "5:30");
		Assert.assertEquals(18.0, fee, 0.0);
	}

	@Test
	public void testOuterNightMediumDistance_case2() { // �⻷�����£�ҹ����;
		/*
		 * case 2: �Ʒ�·��Ϊ9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 9, "5:30");
		Assert.assertEquals(36.0, fee, 0.0);
	}

	@Test
	public void testOuterNightLongDistance_case3() { // �⻷�����£�ҹ�䳤;
		/*
		 * case 3: �Ʒ�·��Ϊ11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 11, "5:30");
		Assert.assertEquals(42.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeShortDistance_case4() { // �⻷�����£������;
		/*
		 * case 4: �Ʒ�·��Ϊ2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 2.7, "11:30");
		Assert.assertEquals(14.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeMediumDistance_case5() { // �⻷�����£�������;
		/*
		 * case 5: �Ʒ�·��9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 9, "11:30");
		Assert.assertEquals(29.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeLongDistance_case6() { // �⻷�����£����쳤;
		/*
		 * case 6: �Ʒ�·��11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 11, "11:30");
		Assert.assertEquals(34.0, fee, 0.0);
	}

	@Test
	public void testWaitingFee_case1() { // �⻷�����£����쳤;
		/*
		 * case 1: �Ʒ�·��11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(19, 2, 11, "11:30");
		Assert.assertEquals(35.0, fee, 0.0);
	}

	@Test
	public void testWaitingFee_case2() { // �ڻ������£�ҹ���;
		/*
		 * case 2: �Ʒ�·��2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(10, 1, 2.7, "5:30");
		Assert.assertEquals(19.0, fee, 0.0);
	}

}
