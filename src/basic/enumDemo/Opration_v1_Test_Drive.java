package basic.enumDemo;

import org.junit.Test;

/**
 * @author E-mail: hwy1782@gmail.com
 * @date  2013-1-30 下午04:24:46
 * @descr Opration_v1 测试方法 {@link Opration_v1}
 * <br/>
 * 下面方法的缺点：
 * 添加新的enum常量时，如果忘记添加相对应的apply方法。在编译的时候不会报错，只是在运行期会报错。
 */
public class Opration_v1_Test_Drive {

	@Test
	public void test_Opration_v1(){
		System.out.println(Opration_V1.PLUS.apply(4.5, 5.6));
	}
	
	@Test
	public void test_Opration_v1_Error(){
		System.out.println(Opration_V1.ERROR.apply(4.5, 5.6));
	}
	
}
