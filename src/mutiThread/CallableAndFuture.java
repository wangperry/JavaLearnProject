package mutiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 上午09:22:55
 *
 * Callable 和 Future接口   
 * Callable是类似于Runnable的接口，实现Callable接口的类和实现Runnable的类都是可被其它线程执行的任务。   
 * Callable和Runnable有几点不同：   
 * （1）Callable规定的方法是call()，而Runnable规定的方法是run().   
 * （2）Callable的任务执行后可返回值，而Runnable的任务是不能返回值的。   
 * （3）call()方法可抛出异常，而run()方法是不能抛出异常的。   
 * （4）运行Callable任务可拿到一个Future对象，   
 * Future 表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。   
 * 通过Future对象可了解任务执行情况，可取消任务的执行，还可获取任务执行的结果。
 *
 * ref : http://xiangkun.iteye.com/blog/630135
 *
 */
public class CallableAndFuture {

    public static class MyCallable implements Callable{

        int flag;

        public MyCallable(int flag) {
            this.flag = flag;
        }

        @Override
        public String call() throws Exception {
            if(flag == 0){
                return "flag is 0";
            }else if(flag == 1){
                try{
                    while (true) {
                        System.out.println("looping...");
                        Thread.sleep(2000);
                    }
                }catch (InterruptedException e) {
                    System.out.println("Interrupte");
                }
                return "false";
            }else{
                throw new Exception("bad flag");
            }
        }
    }

    public static void main(String[] args) {
        MyCallable task1 = new MyCallable(0);
        MyCallable task2 = new MyCallable(1);
        MyCallable task3 = new MyCallable(2);

        ExecutorService service = Executors.newFixedThreadPool(3);

        try{
            Future future1 = service.submit(task1);
            System.out.println("task1 =>"+future1.get());

            Future future2 = service.submit(task2);
            Thread.sleep(5000);
            System.out.println("task2 cancle=>"+future2.cancel(true));

            Future future3 = service.submit(task3);
            System.out.println("task3 =>"+future3.get());
        }catch (Exception e) {
            System.out.println(e);
        }
        service.shutdown();
    }

}
