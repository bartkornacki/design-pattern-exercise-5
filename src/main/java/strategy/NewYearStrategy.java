package strategy;

public class NewYearStrategy implements DiscountStrategy {
    @Override
    public double discountCalculation(double cost) {
        return cost * 0.20;
    }
}
