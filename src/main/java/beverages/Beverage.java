package beverages;

public interface Beverage {
    double milkPrice = 0.1;
    double cinnamonPrice = 0.5;

    double price();
    double withMilk ();
    double withCinnamon ();
}
