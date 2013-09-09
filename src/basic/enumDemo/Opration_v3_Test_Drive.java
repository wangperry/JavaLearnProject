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
public class Opration_v3_Test_Drive {

    @Test
    public void test_Opration_v2(){
        double a = 4.5;
        double b = 5.6;
        for(Opration_V3 op : Opration_V3.values()){
            System.out.printf("%f %s %f = %f%n",a,op,b,op.apply(4.5, 5.6));
        }
        
        //Opration_V3.valueOf(String xxx) 可以获取”名称“对应的 enum
        System.out.println(Opration_V3.valueOf("DIVIES").PLUS.apply(23, 45));
        
        //a method change symbol to enum
        System.out.println(Opration_V3.formString("+").PLUS.apply(23, 45));
        
    }
    
}
