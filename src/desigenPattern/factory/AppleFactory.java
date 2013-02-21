package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ����10:36:53
 * 
 * ��̬���������ŵ㣺
 * 1.�͹�������ȣ��������ơ�
 * 2.����ÿ�ε��õ�ʱ���½�һ������
 * 3.���Է���ԭ���͵��κ������Ͷ���
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
