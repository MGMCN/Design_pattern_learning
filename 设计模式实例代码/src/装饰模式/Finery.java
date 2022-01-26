package 装饰模式;

public class Finery extends Person{
    protected Person component ;

    public void Decorate(Person component){
        this.component = component ;
    }

//    public void Show(){
//        if(component!=null)
//            component.show() ;
//    }
}
