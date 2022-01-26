package _5_工厂方法模式;

public class VolunteerFactory implements Factory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer() ;
    }
}
