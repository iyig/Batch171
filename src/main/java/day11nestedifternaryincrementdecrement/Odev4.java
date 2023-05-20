package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {

        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String adAd2Soyad=oku.nextLine();

        char adIlkHarf=adAd2Soyad.charAt(0);
        char adIkinciHarf=adAd2Soyad.charAt(adAd2Soyad.indexOf(" ")+1);
        char adUcuncuHarf=adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ")+1);

        System.out.println(adIkinciHarf + "." + adIlkHarf + "." + adUcuncuHarf);
    }
}