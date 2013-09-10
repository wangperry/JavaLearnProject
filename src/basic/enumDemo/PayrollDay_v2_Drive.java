package basic.enumDemo;

import org.junit.Test;

/**
 * 
 * @author hongye.hwy
 * 
 */
public class PayrollDay_v2_Drive {

	private static final double DEFAULT_PAY_RATE = 9.8;
	
	@Test
	public void test_PayrollDay() {

		double workHourse = 8;
		
		System.out.printf("%s work %f hours will get %f ",
				PayrollDay_v2.SAYURDAY,workHourse,PayrollDay_v2.SAYURDAY.pay(8, DEFAULT_PAY_RATE));
	}

}
