package day10ifstatements;

import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String day = input.nextLine();

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if (day.equalsIgnoreCase("Friday")) {
            System.out.println(6);

        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else {
            System.out.println("Hatali giris yaptiniz. Lutfen bir gün ismi giriniz..");
        }

    }
}