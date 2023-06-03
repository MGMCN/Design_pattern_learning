package _10_模板方法模式;

public class StudentAPaper extends TestPaper{
    @Override
    protected String Answer1() {
        return "b" ;
    }

    @Override
    protected String Answer2() {
        return "a" ;
    }

    @Override
    protected String Answer3() {
        return "a" ;
    }
}
