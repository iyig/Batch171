package day20statickeywordconstructors;

public class Car {

/*


Constructor nedir?
Class'dan object uretmemize yarayan code blocklarıdır
Class olusturdugumuzda java bize otomatik olarak bir constructor verir. Ama bu consturctor gözle görülmez
gözle görülmeyen otomatik olarak java tarafından verilen bu constructorlara default constructor denir

default constructor ==> Car() {} şeklindedir

  Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.
    farkli constructor lar sayesinde bir class dan farkli farkli objeler olusturabiliriz

    1)Constructor nasil olusturulur?
        Access Modifier + Class ismi + () + {}

        Interview sorusu:
    2)Method ile constructor arasindaki farklar nelerdir?
        a) Method larda return type olur, constructor larda olmaz
        b) Method lar yaptiklari ise gore isimlendirilirler,
        Constructorlar ise her zaman Class ismi ile isimlendirilirler
        c) Methodlar bir aksiyon yapmak icin olusturulurlar
        Constructorlar ise object olusturmak icindir
        d) Method isimleri kucuk harf ile baslar,
        Constructor larin isimleri class ismi ile ayni oldugu icin herzaman buyuk harfle baslar



 */


    String mark = "Honda";

    String model="Accord";

    int year = 2023;

    boolean hybrid=true;
public Car(String mark,String model,int year,boolean hybrid){
    this.mark=mark;
    this.model=model;
    this.year=year;
    this.hybrid=hybrid;
}
    public Car(String make, String model){
        this.mark=make;
        this.model=model;

    }


    public Car(String make, int year) {
        this.mark = make;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

}