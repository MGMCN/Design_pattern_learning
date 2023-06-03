package _10_模板方法模式;

public class TestPaper {
    public void Question_one(){
        System.out.println("问题1xxx a.xxx b.xxx c.xxx d.xxx") ;
        System.out.println(Answer1()); // Answer1()这个方法是个虚方法，在子类覆盖实现。但是却是父类函数在调用。高明啊!!! 好处是 消除子类的重复代码 !!!
    }
    protected String Answer1(){
        return "" ;
    }
    public void Question_two(){
        System.out.println("问题2xxx a.xxx b.xxx c.xxx d.xxx") ;
        System.out.println(Answer2());
    }
    protected String Answer2(){
        return "" ;
    }
    public void Question_three(){
        System.out.println("问题3xxx a.xxx b.xxx c.xxx d.xxx") ;
        System.out.println(Answer3());
    }
    protected String Answer3(){
        return "" ;
    }
}
