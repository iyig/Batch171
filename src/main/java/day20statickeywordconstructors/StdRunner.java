package day20statickeywordconstructors;

public class StdRunner {


    public static void main(String[] args) {

        System.out.println(Student.stdName);

        Student std1=new Student();
        System.out.println(std1.age);//13

        Student std2=new Student();
        Student.staticMethod();//Ben static methodum
        std2.nonStaticMethod();//en non-static methudum

          // object uzerinden de static class memberlara ulasabilirsiniz tıpki gökteeki ay gibi
        //object üzerinden static class memberlara ulasmak tavsiye edilmez
        System.out.println(std1.stdName);//Tom Hanks
        std1.nonStaticMethod();//Ben non-static methudum
    }


}

