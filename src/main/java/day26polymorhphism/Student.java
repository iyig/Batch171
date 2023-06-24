package day26polymorhphism;

public class Student {
  //Encapsulation ==> kapsulleme
    /*
    Encapsulation Nedir? (Data Hiding) veri saklamak
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz? getmethod olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return type i  okudugu variable in return type i ile ayni olur
    3) get methodun boolean bir variable icin olusturulmus ise get method ismi "is" ile baslar
    ornek: isSuccessful()
      */
  private String stdId="AC20230614";
  public String stdName ="Ali Can";
  public int age = 23;
  private double notOrt =3.53;
  private boolean successful=false;

  public String getStdId() {
    return stdId;
  }

  public double getNotOrt() {
    return notOrt;
  }

  public boolean isSuccessful() {
    return successful;
  }
 /*
    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
    "set method" olusturarak Encapsulate edilmis datanin degerini degistirebiliriz
    1) set methodlar hep public olur
    2) set methodlarin return typei hep void olur
    3) set methodlar parametre kullanir, parametrenin data typei variable ile ayni olur

    NOT 1: set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki
    yeni bir object'mis gibi kullanabiliriz

    NOT 2: get methodlarin diger adi getter, set methodlarin diger adi setter dir
            getter ve setter larin ikisine birden "Java Beans"   denir
     */

  public void setStdId(String stdId) {
    this.stdId = stdId;
  }

  public void setNotOrt(double notOrt) {
    this.notOrt = notOrt;
  }

  public void setSuccessful(boolean successful) {
    this.successful = successful;
  }


}