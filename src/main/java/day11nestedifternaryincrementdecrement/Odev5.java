package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {

 /*

 TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz


        Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        //kullanıcıya seçim içn işlem menusu yazdırdık
        char islem = scan.next().charAt(0);

        System.out.println("ilk sayiyi giriniz");
        double ilk = scan.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double ikinci = scan.nextDouble();
        switch (islem) {
            case '1':
                System.out.println(ilk + ikinci);
                break;
            case '2':
                System.out.println(ilk - ikinci);
                break;
            case '3':
                System.out.println(ilk / ikinci);
                break;
            case '4':
                System.out.println(ilk * ikinci);
                break;
            default:
                System.out.println("Bu islem tanımlanmamiştir");


 */




    /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen

     */
/*
    Scanner input=new Scanner(System.in);
                System.out.println("Ucgen kenarları icin 3 tane uzunluk giriniz...");

                double a=input.nextDouble();
                double b=input.nextDouble();
                double c=input.nextDouble();

                boolean ucgenMi=(a+b>c && c>Math.abs(a-b)) && ( a+c>b && b>Math.abs(a-c)) && ( b+c>a && a>Math.abs(b-c));
     if(ucgenMi){
    if(a==b && a==c && b==c){
        System.out.println("eşkenar ücgendir");
    }else{
        System.out.println("Ucgendir ama eskenar degil..");
    }
}else{
    System.out.println("ücgen değildir");
}


*/


    /* TASK :
     *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
    INFO :
    BMI = kilo(kg) /(boy*boy)(m)
    BMI <=20 oldukca zayifsiniz
    20<BMI<=25 Normal sinirlardasiniz
    25<BMI<=30 Sisman kategorisindesiniz
    30<BMI ==> Obez grubundasiniz.

     */
     Scanner input1=new Scanner(System.in);

        System.out.print("boyunuzu giriniz(1.80): " );
        double boy=  input1.nextDouble();

        System.out.print("kilo  giriniz: "   );
        double kilo=  input1.nextDouble();


       double bmi=kilo/(boy*boy);
        System.out.println("Beden Kitle İndeksiniz = " + bmi);



       if(bmi< 20){
           System.out.println("oldukca zayifsiniz");
       } else if(bmi>20 && bmi<=25){
           System.out.println("Normal sinirlardasiniz");
       }else if(bmi>25 && bmi<=30){
           System.out.println("Sisman kategorisindesiniz");

       }






    /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

    /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.




 */
        }

    }
