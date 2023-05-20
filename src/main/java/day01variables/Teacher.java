package day01variables;


import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {


        String str = "Java is Easy and 8";
        int a = str.replaceAll("[0-9]", "").length();
        System.out.println(a);


        String str1 = "Java güzeldir";
        String v = str1.toUpperCase().replaceAll("" + str1.charAt(0), "");
        String w = str1.toUpperCase().replace("R", "");
        System.out.println(v);
        System.out.println(w);


        String s = "Java daha iyidir.";
        char c = s.charAt(0);
        char d = s.charAt(16);
        System.out.println(c+d);



        String city="mersin";
        String  city2=city.toLowerCase().replace("m","M");


        System.out.println(city2);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String str2 = input.nextLine();

        boolean first=str2.length()>5;
        boolean second=str2.replaceAll("[^A-Z]","").length()>0;
        boolean third=str2.replaceAll("[^a-z]","").length()>0;
        boolean four=str2.replaceAll("[0-9]","").length()>0;

        boolean geçerliMi=first&&second&&third&&four==true;
        System.out.println(geçerliMi);
    }
}