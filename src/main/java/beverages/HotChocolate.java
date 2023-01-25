package beverages;

public class HotChocolate implements Beverage {
    @Override
    public double price() {
        return 1.45;
    }

    public double addCream() {
        return price()+0.15;
    }

    @Override
    public double withMilk() {
        return -1;
    }

    @Override
    public double withCinnamon() {
        return price()+cinnamonPrice;
    }


}
