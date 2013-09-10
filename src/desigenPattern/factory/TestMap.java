package desigenPattern.factory;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author E-mail: hwy1782@gmail.com
 *
 */
public class TestMap {

	@Test
	public void test_Map(){
		Map<Integer,String> values  = new HashMap<Integer, String>();
		
		values.put(1, "zhansan");
		values.put(2, "lisi");
		values.put(3, "wangwu");
		
		for(Integer key : values.keySet()){
			System.out.println(key);
		}
		
		System.out.println("=========");
		
		values.put(4, "ok");
		for(Integer key : values.keySet()){
			System.out.println(key);
		}
		
	}
	
}
