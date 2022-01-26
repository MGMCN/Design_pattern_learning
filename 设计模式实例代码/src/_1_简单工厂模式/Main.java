package _1_简单工厂模式;

public class Main {
    public static void main(String args[]){
        // 没有工厂的时候
        Operation oper = null ;
        oper = new OperationAdd() ;
        oper.setNumberA(2) ;
        oper.setNumberB(1) ;
        System.out.println(oper.GetResult());

        // 有工厂的时候
        Operation oper2 = null ;
        oper2 = OperationFactory.createOperate("+") ;
        oper2.setNumberA(2) ;
        oper2.setNumberB(1) ;
        System.out.println(oper.GetResult());
    }
}
