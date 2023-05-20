package day10ifstatements;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Passwordu giriniz");
       String pwd= input.nextLine();

        String pwd1="pwd123!";
        if (pwd.equals("pwd123!")) {
            System.out.println("Passwordu doğru");
        }else if(!pwd.equals("pwd123!")){
            System.out.println("Yanlış Password girdiniz");


        }

    }


        }