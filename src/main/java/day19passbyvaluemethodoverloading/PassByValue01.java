package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
       //note:java "pass by value" sayesinde variable larin orjinal korur
        int shirtPrice = 100;

        //java methoda gönderirken orjinal degeri degil kopysini gönderir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));


        System.out.println(shirtPrice);
    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 10;
                break;
            default:
                price = price;
        }
    return price;
    }
/*
Pass By Value:
1) Java "pass by value" kullanir
2)Yani ;java methodlarin orjinal degeri degistirmesine musaade etmez
3) Java method lara deger yollarken Orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
Method kopya deger üzerinde degişiklik yapar,böylece orjinal deger korunmuş olur
4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16


 */

}

