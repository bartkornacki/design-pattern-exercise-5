package strategy;

public class EasterStrategy implements DiscountStrategy {
    @Override
    public double discountCalculation(double cost) {
        return cost * 0.1;
    }
}
