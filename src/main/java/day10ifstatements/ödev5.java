package day10ifstatements;

import java.util.Scanner;

public class ödev5 {
    public static void main(String[] args) {


        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
  double toplamFiyat=0;
          Scanner scanner=new Scanner(System.in);
        System.out.println("Girdiginiz urun adedini yaziniz");
        int urunAdedi=scanner.nextInt();

        System.out.println("Urunun liste fiyatini giriniz");
        int listeFiyati=scanner.nextInt();

        System.out.println("Musteri kartiniz var mi ? E : Evet , H : Hayir");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);

        if (kartVarMi=='E'){
            if (urunAdedi>10){
                toplamFiyat=urunAdedi*listeFiyati*80/100;
                System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
            }else{
                toplamFiyat=urunAdedi*listeFiyati*85/100;
                System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
            }

        }else if(kartVarMi=='H'){

          if (urunAdedi>10){
              toplamFiyat=urunAdedi*listeFiyati*85/100;
              System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
          }else{
              toplamFiyat=urunAdedi*listeFiyati*90/100;
              System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
          }

}else{
            System.out.println("Kart bilgisi icin yanlış giris yaptıniz");
        }
    }

        }
