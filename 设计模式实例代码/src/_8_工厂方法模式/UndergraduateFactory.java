package _8_工厂方法模式;

public class UndergraduateFactory implements Factory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate() ;
    }
}
