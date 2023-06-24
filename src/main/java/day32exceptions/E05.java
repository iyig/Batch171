package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {

    public static void main(String[] args) {

        try {

         FileInputStream   fis = new FileInputStream("src/main/java/day32exceptions/file.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

/*
1) FileNotFoundException ve IOException Compile Time Exceptionlardir, yani code yazarken hata aliriz
2)FileNotFoundException path in dogrulugu ve dosyanin varligi ile igilidir
I0Exception tum input ve output islemleri ile igilidir
3) I0Exception class FileNotFoundException classin paretidir
istenirse FileNotFoundException yerine IoException da kullanilabilir
4) IOEception Class ve FileNotFoundException beraber kullanilacaksa FileNOtFoundException ustte IoException altta
kullanilmalidir


 */
    }
    }

