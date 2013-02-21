package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 上午10:36:53
 * 
 * 静态工厂方法优点：
 * 1.和构造器相比，他有名称。
 * 2.不必每次调用的时候都新建一个对象。
 * 3.可以返回原类型的任何子类型对象。
 * 
 */
public class AppleFactory {
	
	private static AppleFactory factory;
	
	private AppleFactory() {}
	
	public static AppleFactory getInstance(){
		if(factory == null){
			factory = new AppleFactory();
			return factory;
		}
		return factory;
	}
	
	public Apple produceApple(){
		return new Apple(2.3,"red");
	}
	
}
