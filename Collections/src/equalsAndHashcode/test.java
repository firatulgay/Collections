package equalsAndHashcode;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
       while(true){
           System.out.println("sayı giriniz");
           int sayi = scanner.nextInt();

           if (sayi==0){
               System.out.println("sayıların toplamı = "+ toplam);
               break;
           }
           toplam = toplam + sayi;
       }
    }
}
