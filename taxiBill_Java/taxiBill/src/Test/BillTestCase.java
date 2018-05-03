package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Work.GetInformation;

class BillTestCase {

	// 此文件单纯用来存放测试程序正确性的样例

	@Test
	public void testInnerNightShortDistance_case1() { // 内环规则下，夜间短途
		/*
		 * case 1: 计费路程为2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 2.7, "5:30");
		Assert.assertEquals(18.0, fee, 0.0);
	}

	@Test
	public void testInnerNightMediumDistance_case2() { // 内环规则下，夜间中途
		/*
		 * case 2: 计费路程为9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 9, "5:30");
		Assert.assertEquals(36.0, fee, 0.0);
	}

	@Test
	public void testInnerNightLongDistance_case3() { // 内环规则下，夜间长途
		/*
		 * case 3: 计费路程为11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 11, "5:30");
		Assert.assertEquals(43.7, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeShortDistance_case4() { // 内环规则下，白天短途
		/*
		 * case 4: 计费路程为2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 2.7, "11:30");
		Assert.assertEquals(14.0, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeMediumDistance_case5() { // 内环规则下，白天中途
		/*
		 * case 5: 计费路程9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 9, "11:30");
		Assert.assertEquals(29.0, fee, 0.0);
	}

	@Test
	public void testInnerDaytimeLongDistance_case6() { // 内环规则下，白天长途
		/*
		 * case 6: 计费路程11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 1, 11, "11:30");
		Assert.assertEquals(35.0, fee, 0.0);
	}

	@Test
	public void testOuterNightShortDistance_case1() { // 外环规则下，夜间短途
		/*
		 * case 1: 计费路程为2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 2.7, "5:30");
		Assert.assertEquals(18.0, fee, 0.0);
	}

	@Test
	public void testOuterNightMediumDistance_case2() { // 外环规则下，夜间中途
		/*
		 * case 2: 计费路程为9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 9, "5:30");
		Assert.assertEquals(36.0, fee, 0.0);
	}

	@Test
	public void testOuterNightLongDistance_case3() { // 外环规则下，夜间长途
		/*
		 * case 3: 计费路程为11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 11, "5:30");
		Assert.assertEquals(42.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeShortDistance_case4() { // 外环规则下，白天短途
		/*
		 * case 4: 计费路程为2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 2.7, "11:30");
		Assert.assertEquals(14.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeMediumDistance_case5() { // 外环规则下，白天中途
		/*
		 * case 5: 计费路程9;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 9, "11:30");
		Assert.assertEquals(29.0, fee, 0.0);
	}

	@Test
	public void testOuterDaytimeLongDistance_case6() { // 外环规则下，白天长途
		/*
		 * case 6: 计费路程11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(0, 2, 11, "11:30");
		Assert.assertEquals(34.0, fee, 0.0);
	}

	@Test
	public void testWaitingFee_case1() { // 外环规则下，白天长途
		/*
		 * case 1: 计费路程11;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(19, 2, 11, "11:30");
		Assert.assertEquals(35.0, fee, 0.0);
	}

	@Test
	public void testWaitingFee_case2() { // 内环规则下，夜间短途
		/*
		 * case 2: 计费路程2.7;
		 */
		double fee = GetInformation.CalBillUsingInformationFromDataBase(10, 1, 2.7, "5:30");
		Assert.assertEquals(19.0, fee, 0.0);
	}

}
