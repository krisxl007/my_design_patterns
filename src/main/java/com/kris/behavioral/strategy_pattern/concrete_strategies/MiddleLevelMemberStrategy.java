package com.kris.behavioral.strategy_pattern.concrete_strategies;


import com.kris.behavioral.strategy_pattern.strategy_interface.MemberStrategy;

/**
 * Middle level members get the middle discount rate
 */
public class MiddleLevelMemberStrategy implements MemberStrategy {

    private static final double MIDDLE_LEVEL_MEMBER_DISCOUNT_RATE = 0.7d;

    @Override
    public double calculateDiscountPrice(double basePrice) {
        return basePrice * MIDDLE_LEVEL_MEMBER_DISCOUNT_RATE;
    }
}
