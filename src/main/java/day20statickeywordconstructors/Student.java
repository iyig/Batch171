package day20statickeywordconstructors;

public class Student {

/*
1)Static variable veya static methodlar(class member) tum object'ler icin ortak elemandir.
2)Static class member'lar uzerinde yapılan tum degişikler tum objectleri etkiler
3) Static class memberler class'a no-static class member objectlere monte edilir
Mesela; bir class'dan 100 tane object olusturdugunuzda,  non-static olanlar 100 kere olusturulur
ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
4)Static class memberlara ulsasmak icin objeect olusturmaya gerek duyulmaz.
ama non-static class member lara ulasmak icin object olusturmak sarttir.
5)staic variable larin diger adi "Class variable"dir.
Non-static variblelarin diger adi "Instance Variable"veya "object variable"dir

 */

     static String stdName="Tom Hanks";

   public int age=13;
   public static void staticMethod(){
    System.out.println("Ben static methodum");
}
    public void nonStaticMethod(){
    System.out.println("Ben non-static methudum");
}
}


