package _1_简单工厂模式;

public class OperationSub extends Operation{
    @Override
    public double GetResult() {
        return getNumberA()-getNumberB() ;
    }
}
