package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 上午10:35:53
 * 
 * Build 构造器模式
 * 
 * build 构造器模式： 使用内部静态类
 * 
 * 当类的构造器或者静态工厂中有多个参数，采用构造器模式不错
 * 
 */
public class Computer {

	private String name;
	private String type;
	private double screenSize;
	private String produceDate;
	private double price;
	
	public static class Build{
		private String name;
		private String type;
		private double screenSize;
		private String produceDate;
		private double price;
		
		Build(String name,String type){
			this.name = name;
			this.type = type;
		}
		
		public Build screenSize(double size) {
			this.screenSize = size;
			return this;
		}
		
		public Build produceDate(String date) {
			this.produceDate = date;
			return this;
		}
		
		public Build price(double price) {
			this.price = price;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
		
	}
	
	private Computer(Build build) {
		this.name = build.name;
		this.type = build.type;
		this.screenSize = build.screenSize;
		this.produceDate = build.produceDate;
		this.price = build.price;
	}
	
	@Override
	public String toString() {
		return "[computer name = "+name+" type = "+type+" screenSize = "+screenSize+" price "+
				price+" produceDate "+produceDate+"]";
	}
	
}
