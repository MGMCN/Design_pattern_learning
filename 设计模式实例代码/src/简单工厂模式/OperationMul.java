package 简单工厂模式;

public class OperationMul extends Operation{
    @Override
    public double GetResult() {
        return getNumberA()*getNumberB() ;
    }
}
