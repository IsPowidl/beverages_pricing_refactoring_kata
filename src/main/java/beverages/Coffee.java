package beverages;

public class Coffee implements Beverage {
    @Override
    public double price() {
        return 1.2;
    }

    @Override
    public double withMilk() {
        return price()+milkPrice;
    }

    @Override
    public double withCinnamon() {
        return price()+cinnamonPrice;
    }

    public double withMilkAndCream() {
        return price()+0.25;
    }
}
