package equalsAndHashcode;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {


        Set<Player> player_list = new HashSet<Player>();

        Player player1 = new Player("Fırat",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Fırat",1);

        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);

        for (Player player : player_list) {
            System.out.println(player);
        }

        System.out.println("**************************");
        System.out.println("player1 = " + player1.hashCode());
        System.out.println("player4 = " + player4.hashCode());
        System.out.println("**************************");

//        Set<String> string_list = new HashSet<String>();
//
//        String isim1 = new String("fırat");
//        String isim2 = new String("fırat");
//
//        string_list.add(isim1);
//        string_list.add(isim2);
//
//        for (String isim : string_list) {
//            System.out.println(isim);
//        }
//
//        System.out.println("**************************");
//        System.out.println("isim1 = " + isim1.hashCode());
//        System.out.println("isim2 = " + isim2.hashCode());
//        System.out.println("**************************");




    }

}
