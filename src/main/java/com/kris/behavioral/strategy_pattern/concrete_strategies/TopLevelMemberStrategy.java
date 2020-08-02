package com.kris.behavioral.strategy_pattern.concrete_strategies;


import com.kris.behavioral.strategy_pattern.strategy_interface.MemberStrategy;

/**
 * Top level members get the highest discount rate
 */
public class TopLevelMemberStrategy implements MemberStrategy {

    private static final double TOP_LEVEL_MEMBER_DISCOUNT_RATE = 0.5d;

    @Override
    public double calculateDiscountPrice(double basePrice) {
        return basePrice * TOP_LEVEL_MEMBER_DISCOUNT_RATE;
    }
}
