package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {
         // Bir Array in elemanlari Array ise bu Arrayler Multidemensional Array dir
        //Multidimensional Array nasil olusturulur


        int a [][]=new int[3][2];

// Multidemensional Array lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

   //Multidemensional Array nasil yazdirilir?

        System.out.println(Arrays.toString(a));     //[[I@48140564, [I@58ceff1, [I@7c30a502]

        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]
        // multidemensional arrayleri console a yazdirmak icin toString() methodu degil,deepToString() methodunu kullaniriz


        // Multidemensional Array icinden specific bir eleman nasil yazdirilir
        System.out.println(a[1][1]);  //45
        System.out.println(a[2][1]);   //0


        // Multidemensional array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));  // [5, 12]

        //Kisa yoldan Multidimensional  array nasil olusturulur?

        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","kayahan"}};

   //Ornek 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz


        int sum=0;
       for(String[] w:students){
    sum=sum+w.length;
       }

        System.out.println(sum);//8
    }
}
