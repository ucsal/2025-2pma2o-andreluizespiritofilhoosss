package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {

    private final Map<CustomerType, DiscountPolicy> policies;

    public DiscountCalculator() {
        policies = new HashMap<>();
        policies.put(CustomerType.REGULAR, new RegularDiscount());
        policies.put(CustomerType.PREMIUM, new PremiumDiscount());
        policies.put(CustomerType.PARTNER, new PartnerDiscount());
    }

    public double apply(double amount, CustomerType type) {
        DiscountPolicy policy = policies.get(type);
        if (policy == null) {
            return amount;
        }
        return policy.apply(amount);
    }
}
