package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
/*


1)Run button una bastiktan sonra console da alinan Exceptionlara "Runtime Exception" denir.
ArithmeticException, NullPointerException, NumberFormatException,ArrayIndexOutOfException
StringIndexOutOfBoundsException... Runtime Exception lara örnektir
Runtime Exceptionlara Unchecked Exception da denir.

2) Code yazarken kirmizi alt cizgi seklinde alinan Exception lar da vardir, bunlara da "Console Time Exception" denir
FileNotFoundException, IOException compile time exception lara örnektir
Compile Time Exception lara Checked Exception da denir
 *

 throw ile throws keywordleri arasindaki fark nedir?
1) throw method body si icinde throws ise method parantezinden hemen sonra kullanilir
2) throw method body si icinde istenilen yerde istenildiği kadar kullailir
throws ise method parantezinden hemen sonra sadede bir kere kullanilabilir
3) throw dan sonra new keyword ve constructor kullanilarak obje olusturulur
throws dan sonra ssadece Exception class ismi yazilir
4) throw bell sartlar icin Exception firilatmada kullanilir
throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir
 */

    public static void main(String[] args) throws IOException ,FileNotFoundException {
        FileInputStream fis= new FileInputStream("src/main/java/day32exceptions/file.txt");
     int k=0;
      while((k=fis.read())!=-1){
          System.out.print((char)k);
      }
    }

}
