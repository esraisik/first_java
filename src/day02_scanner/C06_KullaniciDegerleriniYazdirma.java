package day02_scanner;

import java.util.Scanner;

public class C06_KullaniciDegerleriniYazdirma {

    public static void main(String[] args) {

        // Soru 3:   Kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in)  ;

        System.out.println("Lütfen isminizi giriniz..");

       // String girilenİsim = scanner.next() ; // bu ilk space'e kadar olan kısmı alır.
        String girilenIsim2 = scanner.nextLine(); // bütün satırı alır

        System.out.println("Lütfen soyisminizi giriniz..");
        String girilenSoyisim = scanner.nextLine();

        System.out.println(" Lütfen yaşınızı giriniz..");
         int yas = scanner.nextInt();

        System.out.println(
                "İsminiz: " + girilenIsim2 +
                        "\nSoyisminiz: " + girilenSoyisim +
                        "\nYasiniz: " + yas +
                        "\nKaydınız basariyla tamamlanmıstır."

        );
    }
}
