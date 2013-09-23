package basic.enumDemo.basic;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-1-30 04:16:24
 */
public enum Opration_V3 {
	
	PLUS("+"){double apply(double x, double y) {return x+y;}},
	MINS("-"){double apply(double x, double y) {return x-y;}},
	TIMES("x"){double apply(double x, double y) {return x*y;}},
	DIVIES("/"){double apply(double x, double y) {return x/y;}};
	
	private String symbol;
	
	private Opration_V3(String symbol) {
		this.symbol = symbol;
	}
	
	abstract double apply(double x,double y);
	
	@Override
	//use symbol to display enum
	public String toString() {
		//Returns the name of this enum constant, as contained in the declaration
		return symbol;
	}
	
	/**
	 * get enum of the symbol 
	 * @param symbol
	 * @return
	 */
	public static Opration_V3 formString(String symbol){
		return stringToEnum.get(symbol);
	}
	
	private static final Map<String,Opration_V3> stringToEnum = Maps.newHashMap();
	
	static{
		for(Opration_V3 op : Opration_V3.values()){
			stringToEnum.put(op.toString(), op);
		}
	}
	
	
	
}
