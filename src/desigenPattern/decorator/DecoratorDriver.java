package desigenPattern.decorator;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-18 下午2:24
 */
public class DecoratorDriver {

    @Test
    public void testDecorator(){
        Coffee c = new SimpleCoffee();
        System.out.println("cost = " + c.getCost()+", ingredients "+c.getIngredients());

        c = new Milk(c);
        System.out.println("cost = " + c.getCost()+", ingredients "+c.getIngredients());

        c = new Whip(c);
        System.out.println("cost = " + c.getCost()+", ingredients "+c.getIngredients());
    }

}
