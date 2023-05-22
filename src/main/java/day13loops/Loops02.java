package day13loops;

public class Loops02 {
    public static void main(String[] args) {



        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bölünebilen tamsayiları ekrana yazdıriniz

        for (int i=21; i<181; i++){
            if (i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
    //Örnek2: Size verilen kücük harfle yazilmiş String in index i cift sayi olan charakterlerini buyuk harfe
        //dönüstüren kodu yazınız
        //   ankara==>

        String s="ankara";


        for (int i=0; i<s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }


        }
//Ornek 3. Veilen bir string de ilk a harfınden önceki tum characterleri console a yazdırınız
        //"I love Java" 00>"I love J"

        String s1= "Tramvay";
        for (int i=0; i<s1.length();i++){
           char  ch=s1.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.println(s1.charAt(i));
        }
  //Irnek4: Verilen bir string te so 'a' dan sonraki tüm characterleri ters sirada yazdiriniz
        //"Germany"  ==> yn

        String t= "Germany";

        for (int i=t.length()-1; i>=0  ;i-- ){
            if (t.charAt(i)=='a'){
                break;
            }


            System.out.print(t.charAt(i));
        }



    }

}


