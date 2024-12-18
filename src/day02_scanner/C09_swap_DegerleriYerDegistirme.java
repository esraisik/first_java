package day02_scanner;

import java.util.Scanner;

public class C09_swap_DegerleriYerDegistirme {
    public static void main(String[] args) {


        // Soru 7:( İnterview)  Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin. (swap)

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen 1. sayıyı giriniz...");

        int sayi1 = scanner.nextInt(); // 15

        System.out.println("Lütfen 2. sayıyı giriniz..");

        int sayi2 = scanner.nextInt(); // 25


        int yedek = sayi2 ;

        sayi2 = sayi1 ;

        sayi1 = yedek ;


        System.out.println("Sayı1'in yeni değeri: " + sayi1); // 25
        System.out.println("Sayı2'nin yeni değeri: " + sayi2); // 15


    }
}
