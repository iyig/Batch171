package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December


        Scanner input=new Scanner(System.in);
        System.out.println("Başlangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth=input.nextInt();
        switch (numOfMonth){
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Agust");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("gecerli ay numarasi veriniz...");
        }

    /*
    Note: Switch condition parantezi icinde String int byte short char kullanilabilir
    Note: switch condition parantezi icinde long float boolean double kullanilamaz
     */


    }

}
