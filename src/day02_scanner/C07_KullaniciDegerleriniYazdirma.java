package day02_scanner;

import java.util.Scanner;

public class C07_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        // Soru 4:  Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        // Kaydınız basarılı şekilde olusturuldu.

        Scanner scanner = new Scanner(System.in)  ;

        System.out.println("Lütfen isminizi giriniz..");

        String girilenIsim2 = scanner.nextLine(); // bütün satırı alır

        System.out.println("Lütfen soyisminizi giriniz..");
        String girilenSoyisim = scanner.nextLine();

        System.out.println(" Lütfen yaşınızı giriniz..");
        int yas = scanner.nextInt();

        System.out.println(
                "Girilen bilgiler" + girilenIsim2.charAt(0) + " " + girilenSoyisim + ", " + yas +
                "\n Kaydınız basarılı sekilde olusturuldu."

        );
    }
}
