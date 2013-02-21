package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ионГ10:44:36
 * 
 */
public class AppleDriver {
	
	public static void main(String[] args) {
		AppleFactory factory1 = AppleFactory.getInstance();
		
		AppleFactory factory2 = AppleFactory.getInstance();
		
		System.out.println(factory1.produceApple());
		
		System.out.println("factory1 == factory2 ? "+(factory1 == factory2));
	}

}
