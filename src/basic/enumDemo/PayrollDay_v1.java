package basic.enumDemo;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-1-31 上午11:32:51
 * Payroll 枚举工资单，计算每天的工资
 * 
 * </br>缺点：
 * </br>
 * 添加一个新的enmu，忘记在pay()方法中添加相应的switch条件的话，就会采用default的计算pay的方法。
 * 
 */
public enum PayrollDay_v1 {

	MONDAY,TUESDAY,WEDNESDAY,THRSDAY,FRIDAY,SAYURDAY,SUNDAY;
	
	private static final int DEFAUL_WORK_HOUR = 8;
	
	double pay(double workHoues,double payRate){
		double basicPay = DEFAUL_WORK_HOUR * payRate;
		double overTimePay = 0;
		switch (this) {
		case SAYURDAY: case SUNDAY:
			overTimePay = workHoues * payRate * 2;
		default:
			overTimePay = (workHoues - DEFAUL_WORK_HOUR) * payRate * 2;
		}
		
		return basicPay + overTimePay;
	}
	
}
