package 装饰模式;

public class Finery extends Person{
    protected Person component ;
//    private Person component ; // 当component访问权限修饰为private的时候，运行代码试试看。嘻嘻

    public void Decorate(Person component){
        this.component = component ;
    }

//    public void Show(){
//        if(component!=null)
//            component.show() ;
//    }
}
