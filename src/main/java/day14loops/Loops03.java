package day14loops;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {
           /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangıc degerini giriniz...");
        int start = input.nextInt();
        System.out.println("Btis degerini girijjniz...");

        int end = input.nextInt();

        if (start > end) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz...");
        } else {

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

        }
    //Irnek 2: ic sayi kullanmadan 1 den 100 e kadar olan sayıları console yazdırınız
      for (int i='d'/'d'; i<='d';i++){
          System.out.print(i+ " ");
      }

            // int d='d;
        //system.out.println(d)

        /*
        Note 1: Bazi loop lar sonsuz defa calısabilir,Bu  tarz looplara İnfinite(sonsuz ) loop denir
        İnfinie(sonsuz) loop genellile "increment/decrement" kisminda yapılan hatandan kaynaklanir
        for (int i=1; i<10;ş--){
        }

        Not2: Loop olusturdugumuzda "ikinci kismi"(loop calısma sarti) yazmazsaniz Infinite(sonsuz) loop olur
        for(int i=0;     ;   i++){

        Note 3: Bazi looplar hic calimayabilir

        for (int i = 1; i <0 ; i--) {

        }
         */
    }
}
