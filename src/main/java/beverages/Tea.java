package beverages;

public class Tea implements Beverage {
    @Override
    public double price() {
        return 1.5;
    }

    @Override
    public double withMilk() {
        return price()+milkPrice;
    }

    @Override
    public double withCinnamon() {
        return price()+cinnamonPrice;
    }
}
