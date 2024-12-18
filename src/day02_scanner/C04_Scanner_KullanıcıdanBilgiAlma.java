package day02_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanıcıdanBilgiAlma {

    public static void main(String[] args) {

        // Kullanıcıdan bir tam sayı alıp
        // sayının karesini yazdırın.

        // 1. adım : bir scanner objesi olusturun.


        Scanner scanner = new Scanner(System.in) ;
       // Scanner scan = new Scanner(System.in) ;
        // Scanner sc = new Scanner(System.in) ;
        //  Scanner ali = new Scanner(System.in) ;
        // objenin adını istediğimiz gibi belirleyebiliriz
        // ANNCAKK scanner class'ından bir obje oldugunu belirten bir isim olması TERCİH EDİLİR.


        // 2. adım: kullanıcıya ne istediğinizi söyleyin.

        System.out.println( "Lütfen bir tam sayı giriniz...");

        // 3.adım: kullanıcıdan istediğimiz datanın türüne uygun
        // next.... method'unu kullanıp konsoldan değeri alın.

      int girilenSayi =  scanner.nextInt();

        System.out.println("girdiğiniz sayının karesi : " + girilenSayi* girilenSayi);

    }
}
