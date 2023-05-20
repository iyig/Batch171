package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class ödev2 {

    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java

        String text=scan.nextLine();

       boolean boslukVarMi= text.contains(" ");
        System.out.println(boslukVarMi);

        boolean bosMu=text.isEmpty();
        System.out.println(bosMu);

    }
}