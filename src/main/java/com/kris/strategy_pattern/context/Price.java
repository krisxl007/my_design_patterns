package com.kris.strategy_pattern.context;


import com.kris.strategy_pattern.strategy_interface.MemberStrategy;

/**
 * This is the context class
 */
public class Price {

    // A strategy reference in context class is a must
    MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscountPriceByMemberLevel(double basePrice) {
        if(strategy != null) {
            return strategy.calculateDiscountPrice(basePrice);
        }else {
            System.out.println("Strategy is not initialized, can't get discount price");
            return basePrice;
        }
    }
}
