package 代理模式;

public class Pursuit implements GiveGift{
    SchoolGirl girl ;

    Pursuit(SchoolGirl girl){
        this.girl = girl ;
    }

    @Override
    public void GiveDolls() {
        System.out.println("送"+girl.getName()+"洋娃娃！");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送"+girl.getName()+"鲜花！");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送"+girl.getName()+"巧克力！");
    }
}
