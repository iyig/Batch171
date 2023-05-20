package day04scannerwrapper;

import java.util.Scanner;

public class ödev {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");

        double sayi1=input.nextDouble();
        System.out.println("ikinci bir sayı giriniz");
        double sayi2=input.nextDouble();
        System.out.println("Ücüncü bir sayı giriniz");
        double sayi3=input.nextDouble();

        System.out.println((sayi1 + sayi2 + sayi3)/3);
    }



}
