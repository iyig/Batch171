package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("boyunuzu cm cinsinden giriniz: ");

        double boyCm = scan.nextDouble();
         double boy=boyCm/100;

         System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        double kilo = scan.nextDouble();
    double vke=kilo/(boy*boy);
       System.out.println(vke);


        //double bmi=kilo/(boy*boy);
       // System.out.println("Beden Kitle İndeksiniz = " + bmi);



        //b=b/100;
//    double endeks  = k/(b*b);

       // double bmi = kilo / (boy * boy);
     //   System.out.println("Beden Kitle İndeksiniz = " + bmi);
    }
}