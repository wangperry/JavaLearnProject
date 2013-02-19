package basic.enumDemo;

import org.junit.Test;

/**
 * @author E-mail: hwy1782@gmail.com
 * @date  2013-1-30 下午04:24:46
 * @descr Opration_v1 测试方法 {@link Opration_v1}
 * <br/>
 * 枚举类型中的抽象方法必须被它所有常量中的具体方法所覆盖。
 * 因此新增常量的时候就不会忘记添加方法，否则编辑器会报错
 */
public class Opration_v2_Test_Drive {

    @Test
    public void test_Opration_v2(){
        System.out.println(Opration_V2.PLUS.apply(4.5, 5.6));
    }
   
}