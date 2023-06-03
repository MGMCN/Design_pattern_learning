package _8_工厂方法模式;

public class SimpleFactory {
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng leiFeng = null ;
        switch (type){
            case "undergraduate":
                leiFeng = new Undergraduate() ;
                break ;
            case "volunteer":
                leiFeng = new Volunteer() ;
                break ;
        }
        return leiFeng ;
    }
}
