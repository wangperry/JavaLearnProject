package desigenPattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-18 下午2:13
 */
public class SimpleCoffee extends Coffee {

    SimpleCoffee(){}

    public double getCost() {
        return 1;
    }

    public String getIngredients() {
        return "coffee";
    }
}
