package 商场促销_策略模式;

public class Main {
    public static void main(String args[]){
        // 简单工厂模式的话
        CashSuper cs = CashFactory.createCashAccept("return") ; // normal | rebate | return
        double money = 900 ;
        double realmoney = cs.acceptCash(money) ;
        System.out.println(realmoney) ;

        // 策略模式+简单工厂模式的话
        CashContext cc = new CashContext("return") ;
        double money2 = 900 ;
        double realmoney2 = cc.GetResult(money) ;
        System.out.println(realmoney2) ;

        // 方法2 为什么比 方法1 好 ？
        // 方法一 客户端 需要认识 CashSuper类和CashFactory类，方法二 客户端 只需要认识 CashContext类一个即可 。
        // 方法二 隐藏了 与Cash有关的方法细节 松耦合 。
    }
}
