package day03_DataCasting_wrapperClasses;

import java.util.Scanner;

public class C03_Ornek {

    public static void main(String[] args) {


        // kullanıcıdan iki tam sayı alıp
        // birinci tam sayıyı ikinci tam sayıya bölün
        // ve sonucu ondalıklı olarak yazdırın


        Scanner scanner = new Scanner(System.in) ;

        System.out.println( "Lütfen iki tam sayı girin.");

        int sayi1= scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println( "İki sayının bölüm sonucu " + (sayi1/sayi2)); // 123/10===> 12.3

        // Java iki tamsayıyı böldüğünde sonucun sadece tamsayı kısmını yazdırır. 12

        System.out.println("İki sayının bölüm double sonucu" + (double)(sayi1/sayi2)) ; // 12.0

        //java önce bölme işlemini yapıp sonra cast ettiği için sonucu 12.0 yazdırdı.

        System.out.println("sayı1'i double yapınca bölüm double sonucu" + ((double)sayi1/sayi2)); // 12.3

        System.out.println("sayı2'yi double yapınca bölüm double sonucu" + (sayi1/(double)sayi2)); // 12.3

        System.out.println("İki sayıyı da double yapınca bölüm double sonucu" + ((double)sayi1/(double)sayi2)); // 12.3







    }
}
