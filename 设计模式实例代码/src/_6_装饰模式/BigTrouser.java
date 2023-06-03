package _6_装饰模式;

public class BigTrouser extends Finery{
    public void show(){
        System.out.print("垮裤 ");
        component.show() ;
    }
}
