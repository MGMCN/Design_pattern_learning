package _5_工厂方法模式;

public class Main {
    public static void main(String args[]){
        // 简单工厂模式
        LeiFeng person1 = SimpleFactory.CreateLeiFeng("undergraduate") ; // 如果我们要替换为创建志愿者的话，那么需要更改至少两处undergraduate为volunteer
        person1.Sweep() ;
        person1.Wash() ;
        LeiFeng person2 = SimpleFactory.CreateLeiFeng("undergraduate") ;
        person2.Sweep() ;
        person2.Wash() ;

        // 工厂方法模式
        Factory factory = new UndergraduateFactory() ; // 如果我们要创建的是volunteer，那么只需要更改这句为创建志愿者工厂即可，其他代码不需要更改。
        LeiFeng person3 = factory.CreateLeiFeng() ;
        LeiFeng person4 = factory.CreateLeiFeng() ;
        person3.Sweep() ;
        person3.Wash() ;
        person4.Sweep() ;
        person4.Wash() ;

        // 两种方法 见仁见智 !
    }
}
