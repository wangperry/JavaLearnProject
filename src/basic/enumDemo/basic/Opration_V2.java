package basic.enumDemo.basic;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-1-30 04:16:24
 */
public enum Opration_V2 {
	
	PLUS{double apply(double x, double y) {return x+y;}},
	MINS{double apply(double x, double y) {return x-y;}},
	TIMES{double apply(double x, double y) {return x*y;}},
	DIVIES{double apply(double x, double y) {return x/y;}};
	
	abstract double apply(double x,double y);
	
}
