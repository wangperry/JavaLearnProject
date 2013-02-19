package basic.enumDemo;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-1-31 上午11:32:51
 * Payroll 枚举工资单，计算每天的工资
 * 
 * </br>改进点：
 * </br>
 * 修复版本1中存在的缺陷:
 * 新增一个枚举的时候忘记添加相应的计算工资的方法。</br>
 * 方法：
 * 1.添加一个abstract 方法，每个枚举常量必须实现这个abstract方法，在这个abstract方法中实现每个enum常量的pay()方法。
 * 但是上述的方法有一个缺陷，每个枚举常量必须都实现这个abstract方法，不能做到这个方法的复用。
 * 
 * 2.此处使用策略枚举(strategy enum)来解决这个问题
 * 枚举策略的使用条件是：
 * <br/>
 * 枚举常量中： 存在多个常量共用一个方法的时候，抽象公用方法为枚举
 * <br/>
 * 可以将这种策略枚举添加在外部枚举常量的构造函数中，解决新加常量时遗忘添加方法的问题
 * 
 */
public enum PayrollDay_v2 {

	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THRSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	SAYURDAY(PayType.WEEKDAY),
	SUNDAY(PayType.WEEKEND);
	
	private final PayType payType;
	
	PayrollDay_v2(PayType type){
		this.payType = type;
	}
	
	
	public double pay(double workHourse,double payRate){
		return payType.pay(workHourse, payRate);
	}
	
	//策略枚举
	private enum PayType{
		WEEKDAY{
			@Override
			double overtimePay(double workHourse,double payRate) {
				return workHourse > DEFAUL_WORK_HOUR ? 0 : (workHourse - DEFAUL_WORK_HOUR)*payRate;
			}
		},
		WEEKEND{
			@Override
			double overtimePay(double workHourse,double payRate) {
				return workHourse * payRate;
			}
		};
		
		static final int DEFAUL_WORK_HOUR = 8;
		
		abstract double overtimePay(double workHourse,double payRate);
		
		double pay(double workHourse,double payRate){
			double basicPay = workHourse * payRate;
			return basicPay + overtimePay(workHourse, payRate);
		}
		
	}
	
}
