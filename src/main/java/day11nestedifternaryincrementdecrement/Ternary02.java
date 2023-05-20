package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {


        //Ornek 1;

        int a = 10;
        int b = 20;

        int r1 = b< a ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);


        //Ornek 2 Verilen bir sayinin mutlak degerini hesaplyan kodu yazınız

        // -4==>  -1*-4

        int c=4;
      int r2=  c<0 ? -1*c : c;
        System.out.println(r2);


        //Örnek 3: İki sayinin isareti ayni ise sayiları carpan isaretleri farklı ise
        //"farkli isaretli sayiları carpamiyorum " mesaji vren kodu yazınız

        int m=4;
        int n=-6;

       Object r3= (m>0 && n>0) || (m<0 && m<0) ? m*n : "farkli isaretli sayiları carpamiyourm";

        System.out.println(r3);

        //ornek 4: Size verilen sayinin 3 basamaklı olup olmadığını kontrol eden kodu yazınız

        int p= -313;
         p=Math.abs(p);
        String r4=p>99 && p<1000 ? "uc basamaklıdır" : "uc basamakli degildir";
        System.out.println(r4);
    }
}