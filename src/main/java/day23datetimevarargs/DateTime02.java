package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);//21:15:17.811171100


        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute=myCurrentTime.getMinute();
        System.out.println(minute);

        int second=myCurrentTime.getSecond();
        System.out.println(second);

        int nano=myCurrentTime.getNano();
        System.out.println(nano);
  //Gelecek ve gecmise nasil gidilir?
      LocalTime next= myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);//21:15:17.811171100




        //Zaman formati nasil degistirilir?
/*
DateTime class ta kullanlan tarih saat formatlari

HH : mm ==> 24 lu saat sistemi
hh : mm ==> 12 lu saat sistemi AM ,PM gösterilmez
hh : mm a ==> 12 lu saat sistemi AM , PM gösterilir
HH : mm :ss ==> 24 lu saat sistemi
HH : MM ==> yanlis formal MM aylar icin kullanlir
"mm" minute demektir."MM" month demektir

dd-MM-yyyy ==> gun ay yil
MMM ==> Aug
MMMM ==> August
 */


       DateTimeFormatter dtf= DateTimeFormatter.ofPattern("HH : mm");
       String formattedMyCurrentTime=dtf.format(myCurrentTime);
       System.out.println(formattedMyCurrentTime);//23 :55

        //Date formati nasil degistirilir?
        LocalDate myDate=LocalDate.of(2023,8,13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/Yıl sekline ceviriniz
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMydate= dtf2.format(myDate);
        System.out.println(formattedMydate);//  08/13/2023

       // Tarih GUN/Ay isminin ilk 3 harfi / YIL sekline ceviriniz 25/Aug/22
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedMydate2= dtf3.format(myDate);
        System.out.println(formattedMydate2);// 13/08/23


       // Tarih GUN/Ay ismi/Yıl sekline ceviriniz 13/Augustos/2023
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMydate3=dtf4.format(myDate);
        System.out.println(formattedMydate3);//13/Ağustos/2023


        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz

        LocalDate dateInTokya= LocalDate.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(dateInTokya);//2023-06-11


        //Amsterdam da ayin kacı

        LocalDate dateInAmsterdam= LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-06-10



     LocalTime timeInTokyo=   LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//05:55:55.801534700
    }
}