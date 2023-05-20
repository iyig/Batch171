package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        System.out.println(a);//5

        a = a + 2;
        System.out.println(a);//7

        a += 2;
        System.out.println(a);//9

        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.

         int b=5;
        System.out.println(b);

        b=b+5;
        System.out.println(b);

        b+=5;
        System.out.println(b);

        //Decrement
        int c=8;
        System.out.println(c);

        c=c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);

        //İncrement 2
        int d=6;
        d*=2;
        System.out.println(d);
        d=d*2;

        //Decrement 2

        int e=24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        //"1" ile increment

        int f=12;
        f=f+1;
        f+=1;
        f++;

        // "1" ile decrement

        int h=10;
        h=h-1;
        h-=1;
        h--;

        //"post-increment" ve "pre-increment"
        int i=10;
        int k=i++;
        System.out.println(i);//11==>satir sonunda artirildiği icin i nin degerri 11 olur
        System.out.println(k);//10
        int m=15;
        int n=++m;

        System.out.println(m);//16
        System.out.println(n);//16

        //Örnek
        int p=17;
        int r=p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s=20;//19

        int t=--s;//19

        /*
        1) Increment artırmak demektir.Decrrement azaltmak demektir
        2) İncrement toplama ve carpma ile ,Decrement cikarma ve bölme ile yapilabilir
        3) İncrement
        a)i=i+5;
        b)i+=5;
        c) eger 1 ile artırma sözkonusu ise  o zaman i++; tavsiye edilir

        Deremenent

        a)i=i-5;
        b)i-=5;
        c) eger 1 ile azaltma sözkonusu ise  o zaman i--; tavsiye edilir
         */
    }

}
