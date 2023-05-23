package day13loops;

public class Loops03 {


    public static void main(String[] args) {

        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab"  ==> P12?A22

        String s="Pwd12?Ab";

                for(int i=0; i<s.length();  i++){
                  char ch=s.charAt(i);
                  if (ch>='a' && ch<='z'){
                      continue;

                  }else{
                      System.out.println(ch);
                  }

        }
   // note Break ile continue arasındaki fark nedir?
        //break ile switch parantezinin dişina çıkmak icin ve loop u kırmak icin kullanilir
        //continue ise loop yaparken bazı iastenen elemanları isleme sokmamak icin kullanilir
        //continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta götürür

    }
}
