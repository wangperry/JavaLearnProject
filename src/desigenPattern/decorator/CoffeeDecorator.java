package desigenPattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-9-18 下午2:13
 */
public abstract class CoffeeDecorator extends Coffee {

    protected final Coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";

    public CoffeeDecorator (Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getIngredients() {
       return decoratedCoffee.getIngredients();
    }
}


