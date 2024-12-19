package day03_DataCasting_wrapperClasses;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        /*
             1- Daha dar kampsamlı bir değeri
                daha geniş kapsamlı bir variable'a atamak istersek
                Java bu işlemi otomatik olarak yapar
                buna auto widening denir

             2- Daha geniş kapsamlı bir değeri
                daha dar kapsamlı bir variable'a atamak istersek
                Java bu işlemi otomatik olarak yapamaz.
                bizden sorumluluk almamızı bekler.
                sorumluluk almak için değerin önüne parantez içinde
                cevirmek istediğimiz data türünü yazariz
                Bu işleme "EXPLİCİT NARROWİNG" (ZORLA DARALTMA) denir.


         */



        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;

        // Compile time'da Java değerlerle ilgilenmez
        // data türlerini kontrol eder.

        byt = (byte) shrt ;
        byt =(byte) sayiInt ;

        byt = (byte) lng; // 40
        byt =(byte) flt; // 3.5F
       byt = (byte) dbl; // 4.5

       shrt = byt;
       shrt =(short) sayiInt;
       shrt =(short) lng;
       shrt =(short) flt;
       shrt = (short) dbl;


        sayiInt = byt;
        sayiInt = shrt;
        sayiInt =(int) lng;
        sayiInt =(int) flt;
        sayiInt =(int) dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
        lng =(long) flt;
        lng =(long) dbl;

       flt = byt;
       flt = shrt;
       flt = sayiInt;
       flt = lng;
       flt =(float) dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;


    }
}
