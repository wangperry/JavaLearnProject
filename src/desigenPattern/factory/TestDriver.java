package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 *
 */
public class TestDriver {
	
	public static void main(String[] args) {
		ComputerFactory factory1 = ComputerFactory.getInstance();
		
		ComputerFactory factory2 = ComputerFactory.getInstance();
		
		System.out.println(factory1.produceComputer());
		
		System.out.println("factory1 == factory2 ? "+(factory1 == factory2));
	}

}
