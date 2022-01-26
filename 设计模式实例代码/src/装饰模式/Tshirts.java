package 装饰模式;

public class Tshirts extends Finery{
    public void show(){
        System.out.print("T恤 ") ;
        component.show() ;
    }
}
