package _1_简单工厂模式;

public class Operation {
    private double numberA = 0 ;
    private double numberB = 0 ;

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double GetResult(){
        System.out.println("子类并未override->GetResult()方法!"); // 也可以干其他事儿
        return 0 ;
    }
}
