package _6_装饰模式;

public class Main {
    public static void main(String args[]){
        // 装饰模式 多用于 扩展配置 添加新功能
        Person person = new Person("高山") ;

        Sneaker sneaker = new Sneaker() ;
        BigTrouser bigTrouser = new BigTrouser() ;
        Tshirts tshirts = new Tshirts() ;

        sneaker.Decorate(person) ;
        bigTrouser.Decorate(sneaker) ;
        tshirts.Decorate(bigTrouser) ;

        tshirts.show() ;
        // 把此处的person想象为初始功能，我们不断地添加新功能sneaker、bigtrouser等等......
    }
}
