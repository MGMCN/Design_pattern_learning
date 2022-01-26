package 代理模式;

public class Main {
    public static void main(String args[]){
        // 代理的好处 -> girl并不认识她害羞的追求者pursuit，通过代理proxy两人间接的交流。嘻嘻 , 其实就是代理把实体的细节藏了起来 。
        SchoolGirl girl = new SchoolGirl("美女") ;

        Proxy proxy = new Proxy(girl) ;
        proxy.GiveDolls() ;
        proxy.GiveFlowers() ;
        proxy.GiveChocolate() ;
    }
}
