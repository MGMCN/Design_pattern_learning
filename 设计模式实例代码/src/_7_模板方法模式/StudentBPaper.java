package _7_模板方法模式;

public class StudentBPaper extends TestPaper{
    @Override
    protected String Answer1() {
        return "a" ;
    }

    @Override
    protected String Answer2() {
        return "b" ;
    }

    @Override
    protected String Answer3() {
        return "c" ;
    }
}
