package day03_DataCasting_wrapperClasses;

public class   C06_WrapperClasses {
    public static void main(String[] args) {


        String str = "Java Candır";

        System.out.println(str.toLowerCase()); // java candır
        System.out.println(str.toUpperCase()); // JAVA CANDIR


        int sayi= 20 ;


        /*
            primitive'lerin hazır methotları olmaz.
            Java primitive data türlerinin de bazı hazır methot'ları kullanabilmeleri için
            aynı isimlerde WRAPPER CLASS'lar olusturmustur.

            boolean -  char       - byte - short- ınt     - long - float - double
            Boolean -  Character - Byte - Short - Integer - Long - Float - Double
         */

        byte byt1 = 24 ;

        int sayi1 = byt1 ; // auto widening - otomatik genişletme

        short shrt1 = (short) sayi1 ; // explicit narrowing - zorla daraltma


        int sayi2 = 45;
        Integer sayi3= sayi2;

        boolean bl1= true ;
        Boolean bl2= bl1 ;



        // sayı barındıran primitive data türlerinde casting mümkün
        // aynı isimdeki primitive ile wrapper classlar arasında geciş mümkündür.
        // ANNCAKK farklı wrapper class'ları
        // ya da farklı isimdeki bir primitive ile bir wrapper class arasında casting mümkün değildir.


        Integer sayi4= 45;

      //  Double sayi6= sayi4; // Integer'ı Double'a casting yapmaz

        int sayi7= sayi4; // int <=== Integer

       // short sayi8= sayi4 ; //  Integer'ı shorta atama yapamaz




















    }
}
