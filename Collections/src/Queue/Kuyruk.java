package Queue;

import equalsAndHashcode.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {

    public static void main(String[] args) {

        Queue kuyruk = new LinkedList();
        kuyruk.add("Bir");
        kuyruk.add("İki");
        kuyruk.add("Üç");
        kuyruk.offer("Dört");
        kuyruk.offer("Beş");
        kuyruk.offer("Altı");

        System.out.println("kuyruktaki elemanlar: " + kuyruk );
        System.out.println("********************************************");

        while(!kuyruk.isEmpty()){
            System.out.println("Kuyrukta bekleyen eleman : " + kuyruk.peek());
            System.out.println("Kuyruktan çekilen eleman : " + kuyruk.poll());  //Eğer poll() ile veriyi çekmeseydik işaretçi hep aynı veriyi gösterecek ve burada sonsuz bir döngüye girecekti.
        }
    }
}