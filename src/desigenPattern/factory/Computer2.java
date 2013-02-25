package desigenPattern.factory;


/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ����10:35:53
 * 
 * Build ������ģʽ
 * 
 * ��汾1�Ƚϣ�
 * 1. ͨ��Computer2.Build ��ʵ�� Builder �ӿ�
 * 2. ���췽������ӱ����Կ���
 * 3. ���췽������Ӳ������顣������У����Ҫ�ڶ������н��У�������build���н��У���Ϊbuild���ܱ�֤���μ���effective java��39����
 * 
 */
public class Computer2 {

	private String name;
	private String type;
	private double screenSize;
	private String produceDate;
	private double price;
	
	public static class ComputerBuild implements Builder<Computer2>{
		
		private String name;
		private String type;
		private double screenSize;
		private String produceDate;
		private double price;
		
		ComputerBuild(String name,String type){
			this.name = name;
			this.type = type;
		}
		
		public ComputerBuild screenSize(double size) {
			this.screenSize = size;
			return this;
		}
		
		public ComputerBuild produceDate(String date) {
			this.produceDate = date;
			return this;
		}
		
		public ComputerBuild price(double price) {
			this.price = price;
			return this;
		}
		
		@Override
		public Computer2 build(){
			return new Computer2(this);
		}
		
	}
	
	private Computer2(ComputerBuild build) {
		this.name = new String(build.name); //�����Կ���
		this.type = build.type;
		this.screenSize = build.screenSize;
		this.produceDate = build.produceDate;
		this.price = build.price;
		
		//����У��
		if(name == null){
			throw new IllegalArgumentException("name is null");
		}
		
		if(type == null){
			throw new IllegalArgumentException("type is null");
		}
	}
	
	@Override
	public String toString() {
		return "[computer name = "+name+" type = "+type+" screenSize = "+screenSize+" price "+
				price+" produceDate "+produceDate+"]";
	}
	
}
