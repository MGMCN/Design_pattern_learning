package 装饰模式;

public class Sneaker extends Finery{
    public void show(){
        System.out.print("运动鞋 ") ;
        component.show() ;
    }
}
