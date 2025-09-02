package br.com.mariojp.solid.ocp;

public class RegularDiscount implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.95;
    }
}
