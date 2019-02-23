package strategy;

public class ChristimassStrategy implements DiscountStrategy {
    @Override
    public double discountCalculation(double cost) {
        return cost * 0.15;
    }
}
