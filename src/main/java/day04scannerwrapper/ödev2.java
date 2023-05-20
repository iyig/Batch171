package day04scannerwrapper;

import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("üc basamaklı bir sayı giriniz");

        int number=input.nextInt();

        int birlerBasamagı=number%10;
       number= number/10;

       int sondanİkinci=number%10;
       number=number/10;

       int ilkRakam=number%10;

        System.out.println(birlerBasamagı+ sondanİkinci + ilkRakam);
    }

}
