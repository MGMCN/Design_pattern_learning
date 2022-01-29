package _7_模板方法模式;

public class Main {
    public static void main(String args[]){
        TestPaper studenta = new StudentAPaper() ;
        TestPaper studentb = new StudentBPaper() ;

        System.out.println("a学生的答题");
        studenta.Question_one();
        studenta.Question_two();
        studenta.Question_three();

        System.out.println("b学生的答题");
        studentb.Question_one();
        studentb.Question_two();
        studentb.Question_three();
    }
}
