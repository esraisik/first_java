package day02_scanner;

import java.util.Scanner;

import static java.lang.Math.PI;

public class C08_CemberinCevresi {

    public static void main(String[] args) {

        // Soru 5: Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.
       // cevre = 2 * PI * yaricap    alan = PI * yaricap * yaricap

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen çemberin yarıçapını giriniz...");
        double yariçap = scanner.nextDouble();

        System.out.println("Çemberin çevresi: "+ (2 * PI * yariçap) );
        System.out.println("Dairenin alanı :" + (PI * yariçap * yariçap)  );





    }
}
