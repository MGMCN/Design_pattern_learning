package 简单工厂模式;

public class OperationDiv extends Operation{
    @Override
    public double GetResult() {
        if (getNumberB()==0) {
            System.out.println("除数不能为0!");
            return 0;
        }
        return getNumberA()/getNumberB() ;
    }
}
