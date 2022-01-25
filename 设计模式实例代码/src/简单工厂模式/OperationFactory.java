package 简单工厂模式;

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null ;
        switch(operate)
        {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        if (oper==null)
            System.out.println("运算符创建失败!");
        return oper ;
    }
}
