package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
    String adSoyAd=oku.nextLine();
    //char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
    String ad=adSoyAd.substring(0,adSoyAd.indexOf(" "));
    String soyAd=adSoyAd.substring(adSoyAd.indexOf(" ")+1);

        System.out.println(ad);
        System.out.println(soyAd);
    }
}