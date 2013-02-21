package mutiTread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ����09:22:55
 * 
 * Callable �� Future�ӿ�   
 * Callable��������Runnable�Ľӿڣ�ʵ��Callable�ӿڵ����ʵ��Runnable���඼�ǿɱ������߳�ִ�е�����   
 * Callable��Runnable�м��㲻ͬ��   
 * ��1��Callable�涨�ķ�����call()����Runnable�涨�ķ�����run().   
 * ��2��Callable������ִ�к�ɷ���ֵ����Runnable�������ǲ��ܷ���ֵ�ġ�   
 * ��3��call()�������׳��쳣����run()�����ǲ����׳��쳣�ġ�   
 * ��4������Callable������õ�һ��Future����   
 * Future ��ʾ�첽����Ľ�������ṩ�˼������Ƿ���ɵķ������Եȴ��������ɣ�����������Ľ����   
 * ͨ��Future������˽�����ִ���������ȡ�������ִ�У����ɻ�ȡ����ִ�еĽ����
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
