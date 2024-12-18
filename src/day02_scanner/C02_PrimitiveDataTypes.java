package day02_scanner;

public class    C02_PrimitiveDataTypes {

    public static void main(String[] args) {

        boolean gozlukluMu= true ;
        boolean emekliMi = false ;
        // boolean saliMi = " true ";
        // boolean evliMi = 'false' ; // too many characters in charakter literal
        // boolen dogruMu = 1 ; // kabul etmez

        char chr1 = 'a' ;
        char chr2 = '5' ;
        char chr3 = '#' ;
       // char chr4 = "y" ;
        char chr5 = ' ' ; // space de bir karakterdir.
        // char chr6 = ' ab' ;  too many characters in charakter literal
       // char chr7 = 'a '

        // lisedeki öğrencilerin yaşlarını tutan bir variable düşünelim.

        byte yas1 = 16 ; // hafızada 8 bit yer kaplar
        short yas2 = 15 ;// hafızada 16 bit yer kaplar
        int yas3 = 16 ;// hafızada 32 bit yer kaplar
        long yas4 = 16 ;// hafızada 64 bit yer kaplar


        // primitive data türleri barındırdıkları değere göre değil
        // data turune göre hafızada yer kaplarlar.

        int sayı1 = 1 ; // hafızada 32 bit yer kaplar.
         int sayı2 = 100; // hafızada 32 bit yer kaplar.
         int sayı3 = 100000; // hafızada 32 bit yer kaplar.
         int sayı4 = 100000000; // hafızada 32 bit yer kaplar.
        int sayı5 = -100000000 ; // hafızada 32 bit yer kaplar.

        double sayı6 = 24.8 ;
        float sayı7 = 32.7f ;
        float sayı8 = 45.9F ;


        float flt1 = 20f ;
        float flt2 = 6 ;

        System.out.println( flt1 / flt2 ); // 20/6 = 3.3333333333333

        double dbl1 = 20 ;
        double dbl2 = 6 ;

        System.out.println( dbl1 / dbl2 ); // 3.3333333333335

        // UYARI ! double sayıları üstel olarak tuttuğu için
        //  virgülden sonra ilerleyen basamaklarda hata olabilir.









    }
}