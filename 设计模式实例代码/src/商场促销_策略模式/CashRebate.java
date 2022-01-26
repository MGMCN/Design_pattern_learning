package 商场促销_策略模式;

public class CashRebate extends CashSuper{
    private double moneyRebate = 1 ; // 打折

    CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate ;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
