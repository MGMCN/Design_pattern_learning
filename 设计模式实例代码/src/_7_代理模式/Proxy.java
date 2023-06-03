package _7_代理模式;

public class Proxy implements GiveGift{
    Pursuit pursuit ;

    Proxy(SchoolGirl girl){
        pursuit = new Pursuit(girl) ;
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls() ;
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers() ;
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate() ;
    }
}
