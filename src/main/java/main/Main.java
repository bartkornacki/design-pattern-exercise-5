package main;

import product.Product;
import product.ProductService;
import strategy.DiscountType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
        System.out.println("== RTV/AGD Store ==");
        Product productOne = new Product("Samsung TV 55",
                "Samsung TV with a screen size of 55 inches",
                2400.00);

        Product productTwo = new Product("Bosch Fridge",
                "No frost fridge",1400.00);

        Product productThree = new Product("Electrolux Washing Machine",
                "Very quiet washing machine",2200.0);

        Product productFour = new Product("Iron",
                "Easy to handle!",150.00);

        List<Product> products =
                Arrays.asList(productOne,productTwo,productThree,productFour);


        ProductService productService = new ProductService();
        System.out.println("Christmas time ...");
        productService.discount(productOne, DiscountType.CHRISTMASS);
        System.out.println("\n\nEaster time ...");
        productService.discount(productOne, DiscountType.EASTER);
        System.out.println("\n\nNew Yer time ...");
        productService.discount(productOne, DiscountType.NEWYEAR);


//        System.out.println("Christmas time ...");/**/
//        products.forEach(p->p.setDiscount(ProductService.christmasDiscount(p.getCost())));
//        products.forEach(p->p.showProductInfo());
//
//
//        System.out.println("\n\nNew Yer time ...");
//        products.forEach(p->p.setDiscount(ProductService.newYearDiscount(p.getCost())));
//        products.forEach(p->p.showProductInfo());
//
//
//        System.out.println("\n\nEaster time ...");
//        products.forEach(p->p.setDiscount(ProductService.easterDiscount(p.getCost())));
//        products.forEach(p->p.showProductInfo());

    }
}
