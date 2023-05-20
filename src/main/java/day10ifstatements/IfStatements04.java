package day10ifstatements;

import java.util.Scanner;

public class IfStatements04 {

    public static void main(String[] args) {
              /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */


        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen yasiniz giriniz");
        int age=input.nextInt();

        if(age<0){
            System.out.println("Tanımlanmamis yaz");

        }else if(age<5){

            System.out.println("Bebek");
        }else if(age<13){
            System.out.println("Cocuk");
        }else if(age<21){
            System.out.println("Genç");

        }else if(age<31){
            System.out.println("Yetişkin");

        }else{
            System.out.println("Lüften gecerli bir yaş giriniz");
        }
/*
1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadığını kontrol eden ve kullaniciya uygun
mesaj veren kodu yazınız
2)Haftanın mesaj veren kodu yazınız
Pazar00>1.gün, Pazartesi==< 2


3) ay sayısını verdiginizde ay ismini veren kodu yazınız
 */

    }
}
