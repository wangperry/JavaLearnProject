package desigenPattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-18 下午2:13
 */
public class Whip extends CoffeeDecorator {

    public Whip(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.6;
    }

    public String getIngredients() {
       return decoratedCoffee.getIngredients() + ingredientSeparator + " Whip ";
    }
}


