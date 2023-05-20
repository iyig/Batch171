package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Örnek1:Bir String in bas ve sonunda space character i varsa siliniz
        // " Ali Can  "==> "Ali Can"

        String s="  Ali Can     ";
        System.out.println(s);
        //trim() methodu bir String in bas ve sonundaki space characterlerini siler aradaki spacelere dokunmaz

        String sTrimmed=s.trim();
        System.out.println(sTrimmed);

        //ornek 2: Asağıdaki fiyatları verilen urunlerin toplam fiyatini bulunuz
        //String tv = $456.99;    String laptop= $875.99";  ==> 456.99 + 875.99 = 1332.98

        String tv="$456.99";
        String laptop="$875.99";
        String tv2=tv.replace("$","");
        System.out.println(tv2);
        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);

     Double totalPrice=   Double.valueOf(tv2)+ Double.valueOf(laptop2);
     System.out.println(totalPrice);


        //Örnek 3. Verilen ismin ilk ismin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.
        // "Ali Can" ==> AC
        String name= "  ali cAN  ";

         char first=name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);
        System.out.println(""+first +last);
    }

}
