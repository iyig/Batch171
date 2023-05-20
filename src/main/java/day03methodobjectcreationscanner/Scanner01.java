package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        // 1.Adım Scanner Class tan object olustur

        Scanner input=new Scanner(System.in);

        // 2.adım kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lütfen yasınızı giriniz");


        // 3.adım uygun methodu kullanarak kullanicinin verdigi datayi memorye yerleştirmek
        byte age=input.nextByte();
        System.out.println("age = " + age);
    }

}
