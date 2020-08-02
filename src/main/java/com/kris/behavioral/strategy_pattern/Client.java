package com.kris.behavioral.strategy_pattern;


import com.kris.behavioral.strategy_pattern.concrete_strategies.TopLevelMemberStrategy;
import com.kris.behavioral.strategy_pattern.context.Price;
import com.kris.behavioral.strategy_pattern.strategy_interface.MemberStrategy;

/**
 * Client to determine strategy to be used
 */
public class Client {
    public static void main(String[] args) {
        double productBasePrice = 100;

        // can use if/else to new different strategies
        MemberStrategy strategy = new TopLevelMemberStrategy();
        Price price = new Price(strategy);

        double discountPrice = price.calculateDiscountPriceByMemberLevel(productBasePrice);

        System.out.println("This product base price is: " + productBasePrice
                + " ,after member discount your price is: " + discountPrice);
    }
}
