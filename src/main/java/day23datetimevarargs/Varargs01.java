package day23datetimevarargs;

public class Varargs01 {

    public static void main(String[] args) {
        System.out.println(add(2, 3, 4));
    }

    public static int add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }

    // Asagidaki gibi farkli methodlar olusturarak iş yapamayiz
    //cünkü kullanici farkli sayidaki sayiları toplama isteyebilir
    // her ihtimal icin bir method olusturmak mumkün degildir
    //java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    // Bu yapiya Varargs denir
    //Varargs arkada Array yapisini kullanir.
    //toplama islemi yapan bir method olusturun

    public static int add(int a, int b){

        return a+b;
    }

    public static int add(int a, int b, int c){

        return a+b+c;
    }

    public static int add(int a, int b, int c, int d){

        return a+b+c+d;
    }

}
