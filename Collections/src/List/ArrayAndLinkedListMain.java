package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ArrayAndLinkedListMain {
    
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist  = new LinkedList<String>();
        ArrayList<String> arraylist =  new ArrayList<String>();
        
//        zamanHesapla("ArrayList",arraylist);
//        zamanHesapla("LinkedList",linkedlist);

        System.out.println("Normal ***********************");

        arraylist.add("fırat");
        arraylist.add("çahmut");
        arraylist.add("ahmet");
        arraylist.add("nesrin");
        arraylist.add("banu");

        for (String s : arraylist) {
            System.out.println(s);
        }

        System.out.println("Normal *********************");



        System.out.println("Sorted *********************");

        Collections.sort(arraylist);

        for (String s : arraylist) {
            System.out.println(s);
        }

        System.out.println("Sorted *********************");



        System.out.println();

    }
    public static void zamanHesapla(String veri_tipi, List<Integer> list) {
        
        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;
        
        baslangic = System.currentTimeMillis();
        
        for (int i = 0 ; i< 100000 ; i++) {
            
            list.add(0,i);
            
        }
        bitis = System.currentTimeMillis();
        
        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");

    }
    
}
