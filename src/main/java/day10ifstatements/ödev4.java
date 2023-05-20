package day10ifstatements;

import java.util.Scanner;

public class ödev4 {

    public static void main(String[] args) {


/*
                    Password'un ilk harfi buyuk harf ise

                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli


                    Passwordun ilk harfi kucuk harf ise

                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String pwd = input.nextLine();
  if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){

      if(pwd.charAt(0)=='A'){
          System.out.println("Gecerli Password");
      }else{
          System.out.println("Gecerli değil");
      }

  }else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){

      if(pwd.charAt(0)=='z'){

          System.out.println("Gecerli Password");

      }else{
          System.out.println("Gecerli değil");
      }
  }else{
      System.out.println("Ilk character harf olmali");
  }




    }
    }




