package basic.enumDemo.basic;
/**
 * @author E-mail: hwy1782@gmail.com
 */
public enum Opration_V1 {
	
	PLUS,MINS,TIMES,DIVIES,ERROR;
	
	double apply(double x,double y){
		switch (this) {
		case PLUS:
			return x+y;
		case MINS:
			return x-y;
		case TIMES:
			return x*y;
		case DIVIES:
			return x/y;
		}
		throw new AssertionError();
	}
	
}
