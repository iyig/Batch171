package day29collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Bread");
        line.add("Apple");
        line.add("Milk");
        line.add("Orange");
        line.add("Egg");
        line.add("Meat");
        line.add("Tomatoes");

        System.out.println(line);//[Apple, Milk, Bread, Milk, Orange, Egg, Meat, Tomatoes]

        /*
        "Queue" bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden sonra
        "Queue" kullanilamaz, Data type i Queue olan bir object olusturmak icin new Keywordunuden sonra
         1) LinkedList veya 2)PriorityQueue classlari kullanilablir
         "Queue" olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama
         hakkiniz olur
         */


//Deque==> Double ended Queue(iki uclu queue)
        Deque<String> d=new LinkedList<>();

        d.add("Egg");
        d.add("Milk");
        d.add("Cheese");
        d.add("Meat");


        System.out.println(d);//[Cheese, Meat, Egg, Milk]

          /*
        Queue bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden
        sonra Queue yazamayiz. Data tyei Queue olan bir object olusturmak icin
            1)LinkedList veya 2) PriorityQueue classlari kullanilabilir
        Queue olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama
        hakkiniz olur
         */

    }
    }



