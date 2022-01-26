package 商场促销_策略模式;

public class CashReturn extends CashSuper{
    private double moneyCondition = 0 ; // 满多少
    private double moneyReturn = 0 ; // 返多少

    CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money ;
        if(money >= moneyCondition){
            result = money - Math.floor(money/moneyCondition) * moneyReturn ;
        }
        return result;
    }
}
