package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 ионГ10:35:53
 * 
 */
public class Apple {

	private double weight;
	private String color;
	
	public Apple(double w,String c) {
		this.weight = w;
		this.color = c;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	} 
	
	@Override
	public String toString() {
		return "weight = "+weight+" color = "+color;
	}
	
}
