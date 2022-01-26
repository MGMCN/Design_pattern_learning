package _2_商场促销_策略模式;

public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
