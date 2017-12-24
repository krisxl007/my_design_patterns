package com.kris.strategy_pattern.concrete_strategies;


import com.kris.strategy_pattern.strategy_interface.MemberStrategy;

/**
 * Low level members get the low discount rate
 */
public class LowLevelMemberStrategy implements MemberStrategy {

    private static final double LOW_LEVEL_MEMBER_DISCOUNT_RATE = 0.9d;

    @Override
    public double calculateDiscountPrice(double basePrice) {
        return basePrice * LOW_LEVEL_MEMBER_DISCOUNT_RATE;
    }
}
