package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {



    /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */



        Scanner input=new Scanner(System.in);

        System.out.println("bir ülke ismi giriniz");
        String countryName=input.nextLine();

                switch(countryName.toLowerCase()) {

            case "america":
                System.out.println("US");
                   break;
                    case "england":
                        System.out.println("UK");
                    break;
                        case "germany":
                        System.out.println("DE");
                        break;
                    case "turkey":
                        System.out.println("TR");
                   break;
                    case "india":
                        System.out.println("IN");
                        break;
                    case "peru":
                        System.out.println("PE");
                        break;
                    case "Spain":
                        System.out.println("ES");
                        break;
                    case "bulgaria":
                        System.out.println("BU");
                        break;
                    case "albani":
                        System.out.println("AL");
                        break;
                    case "france":
                        System.out.println("FR");
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir ülke adı giriniz");


                }
     /*
       1.)Github ta bulunan projeyi kendi localimize almak icin;
       a)Clone lanmak istenen projenin url i kopyalanir.


      */

    }

}

