package basic.exceptionTest;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-22 上午10:20
 */
public class ExceptionHandler {

    @Test
    public void handlException(){
        try{
            int a = 10;
            int b = 0;
            double c = a / b;

            System.out.println("c = " + c);
        }catch (Exception e){
            if(e instanceof Exception){
                System.out.println("RuntimeException"+e );
            }else if(e instanceof ArithmeticException){
                System.out.println("e = " + e);
            } else {
                System.out.println("e = ====");
            }
        }

    }

}
