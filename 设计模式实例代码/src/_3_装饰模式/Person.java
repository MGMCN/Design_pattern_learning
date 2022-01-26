package _3_装饰模式;

public class Person {
    private String name ;

    Person(String name) {
        this.name = name;
    }

    Person(){}

    public void show(){
        System.out.print("装扮了"+name) ;
    }
}
