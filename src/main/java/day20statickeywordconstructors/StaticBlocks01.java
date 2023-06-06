package day20statickeywordconstructors;

public class StaticBlocks01 {


    //Bir variable olusturdugunuzda, deger atamasaniz o variable i "initialize" etmediniz demektir.
        static double pi;
       static String shape;

// Note:1  static blocklar static varibllari initialize etmek icin kullanilirlar
    // ve class icinde herşeyden önce çalıştırılilar
    //birden fazla static block oldugunda static blocklar yukaridan aşagiya dogru yani yukarida olan önce çalışır
        static {
            pi=3.14;
            System.out.println("Static block 1");
        }

    static {
        shape="Circle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {

/*

Bazen main method dan calistirilmadan önce variable larin hazir hale getirlilmesi gerkir.
bu nedenle atatic block lara ihtiyac duyabiliriz

static varible lar static blocklar icinde initialize edilirse o class in icinde herseyden önce hazir hale
getirilmiş olur
 */


        System.out.println(pi);
        System.out.println("main method");
    }

}
