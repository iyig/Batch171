package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {



    /*
1) StringBuffer java da string ureten bir diger classtir
StringBuffer javanin string uretmek icin olusturdugu ilk classtir
2)StringBuffer , StringBuilder'a cok benzer,yani ikisi de "mutable" string uretir
3)StringBuffer "multi-thread"dir ama StringBuilder "multi-thread" degildir.
4)StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calişir
5) "multi-thread" yapilirken yapilan islerin siralamasi onem arzeder.
 yapilan isleri mantiki bir siraya koymak "synchronization" olarak adlandirilir
 Stringbuffer multi-thread oldugu icin ayni zamanda "synchronized"dir
    3 tane String olusturan Calss ogrendik;
    1)immutable string lazimsa String Class
    2) mutable string lazimsa,StringBuilder veya StringBuffer
        a)StringBuilder multi-thread" gerekmezse kullaniriz
        b)StringBufferi "multi-thread" gerekirse kullaniriz
*/

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);  //Java

        System.out.println(sbf.capacity());  //20
    }
}