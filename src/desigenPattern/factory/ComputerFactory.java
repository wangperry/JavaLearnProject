package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ����10:36:53
 * 
 * ��̬���������ŵ㣺
 * 1.�͹�������ȣ��������ơ�
 * 2.����ÿ�ε��õ�ʱ���½�һ������
 * 3.���Է���ԭ���͵��κ������Ͷ���
 * 4.�ڴ������������͵�ʵ����ʱ�򣬴������ࣺ���磺Map<String,Integer> maps = Maps.newHashMap();
 * 
 */
public class ComputerFactory {
	
	private static ComputerFactory factory;
	
	private ComputerFactory() {}
	
	public static ComputerFactory getInstance(){
		if(factory == null){
			factory = new ComputerFactory();
			return factory;
		}
		return factory;
	}
	
	public Computer produceComputer(){
		return new Computer.Build("����", "7795").price(4550).produceDate("2012-12").screenSize(14.5).build();
	}
	
	public Computer2 produceComputer2(){
		return new Computer2.ComputerBuild("����", "7795").build();
	}
	
}
