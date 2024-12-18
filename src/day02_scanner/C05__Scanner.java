package day02_scanner;

import java.util.Scanner;

public class C05__Scanner {

    public static void main(String[] args) {

        // Kullanıcıdan bir double bir de inr sayı alıp
        // bunların toplamını ve çarpımını yazdırın.


        Scanner scan = new Scanner(System.in) ;

        System.out.println("ondalıklı bir sayı giriniz.");

        double ondaliklisayi = scan.nextDouble();

        System.out.println("bir tam sayı giriniz..");

        int tamSayi = scan.nextInt();

        System.out.println("girilen sayıların toplamı " + (ondaliklisayi + tamSayi));
        System.out.println("girilen sayının çarpımı " + (ondaliklisayi* tamSayi));

    }
}
