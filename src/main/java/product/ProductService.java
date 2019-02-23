package product;

import strategy.*;

public class ProductService {
//    public static double christmasDiscount(double cost){
//        return 0.15 * cost;
//    }
//
//    public static double easterDiscount(double cost){
//        return 0.10 * cost;
//    }
//
//    public static double newYearDiscount(double cost){
//        return 0.2 * cost;
//    }


    public void discount (Product product, DiscountType discountType){
        DiscountStrategy discountStrategy;
        if (discountType.equals(DiscountType.CHRISTMASS)){
            discountStrategy = new ChristimassStrategy();
            product.setDiscount(discountStrategy.discountCalculation(product.getCost()));
            System.out.println(product.getCost());
            System.out.println(product.getDiscount());
        }
        if (discountType.equals(DiscountType.EASTER)){
            discountStrategy = new EasterStrategy();
            product.setDiscount(discountStrategy.discountCalculation(product.getCost()));
            System.out.println(product.getCost());
            System.out.println(product.getDiscount());
        }
        if (discountType.equals(DiscountType.NEWYEAR)){
            discountStrategy = new NewYearStrategy();
            product.setDiscount(discountStrategy.discountCalculation(product.getCost()));
            System.out.println(product.getCost());
            System.out.println(product.getDiscount());
        }
    }

}
