package day02_scanner;


public class C01_VariableİsimVermeKuralları {

    public static void main(String[] args) {

        // kural 1 : deklerasyon bir kere olur ama değer ataması istediğiniz kadar yapılabilir


        int sayi = 10;

        int not;

        not = 90;

        // int not = 80; // Variable 'not' is already defined in scope

        //duoble not = 56.7 ; Variable 'not' is already defined in scope

        // Kural 2 : java'da variable isimleri küçük harfle başlar.

        // ama büyük harf kullanılsa da farketmez.

        //      ÖNEMLİ : Java case sensetive'dir, yani küçük , büyük  harfe duyarlıdır.

        int nOt = 56;
        int noT = 67;
        int Not = 23;


        System.out.println(not); // 90
        System.out.println(Not); // 23

        // slayttaki kural 2

        int not_ = 23;
        int no$t = 45;
        int n1o2t3 = 90;

        //int no&t = 67 ; // Java isimde _ ve $ haricinde özel karakterlere izin vermez.

        //int n o t = 87 ;

        // slayttaki kural 3

        // int 2not = 32; // isim sayı ile başlayamaz.

        int _not = 56; // çok da beğenilmez.
        int $not = 86; // çok da beğenilmez

        // slayttaki kural 4

        // int int = 58 ; // keyword'ler isim olarak kullanılmaz

        // int class = 34 ;

        // int public = 81 ;

        // slayttaki kural 5

        char ismin_ilk_harfi = 'a';
        char isminİlkHarfi = 'y';
        double sınıfınYaşOrtalamasi = 12.6;


    }
}
