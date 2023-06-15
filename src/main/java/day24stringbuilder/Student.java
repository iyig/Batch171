package day24stringbuilder;

public class Student {

/*

Access Modifier
1)public
2)protected
3)default(Access mofier i default yapmak icin access midfier yazmayiz)
4)private

  Note: Access Modifierlari genisten dara dogru siralayiniz
  public  > protected > default > private

  Note: public ==> olanlar her class dan kullanilabilir
  protected ==> olanlar baska package lardan kullanilamaz
  ama baska package da child class icinden kullanilabilir
  default == olanlar başka package den kullanilamazlar
  private==> olanlar sadece olusturuldukları class icinde kullanilablirler

  Note: "protected ile "default" un farkini söyleyiniz?
   protected başka package tan  kullanılamaz ancak başka package de child class icinden kullanilabilirler
   default olanlar başka package den kullanilamazlar

   */
    // public her classtan kullanilabilir
            public String stdName="Ali Can";

            // protected olanlar başka package dan sadece child classlardan görülür
            protected String address="Istanbul";
            // default olanlar baska package dan kullanilamazlar
            String email="alican@gmail.com";
            // private olanlar sadece olusturudukları class icinde kullanilabilirler
            private  String SsnId="123456789";
}
