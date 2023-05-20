package day10ifstatements;

import java.util.Scanner;

public class ödev3 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ay sayisini giriniz");
       int num= input.nextInt();


       if (num== 1){
           System.out.println("Ocak");
       }else if(num==2){
           System.out.println("Şubat");
       }else if(num==3){
           System.out.println("Mart");
       }else if(num==4){
           System.out.println("Nisan");
       }else if(num==5){
           System.out.println("Mayıs");
       }else if(num==6){
           System.out.println("Haziran");
       }else if(num==7){
           System.out.println("Temmuz");
       }else if(num==8){
           System.out.println("Agustos");
       }else if(num==9){
           System.out.println("Eylül");
       }else if(num==10){
           System.out.println("Ekim");
       }else if(num==11){
           System.out.println("Kasim");
       }else if(num==12){
           System.out.println("Aralik");
       }else{
           System.out.println("Hatali giris yaptiniz. Lutfen 1 ile 12 arasinda bir sayi giriniz..");
       }
    }}
