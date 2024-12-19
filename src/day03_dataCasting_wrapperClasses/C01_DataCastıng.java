package day03_DataCasting_wrapperClasses;

public class C01_DataCastıng {
    public static void main(String[] args) {


        /*
             1- String ve boolean baska data turunden değer kabul etmez
             2- Char özel olarak incelenecek
             ama String, boolean, float ve double değerler kabul etmez.
             3- Sayısal data türlerine gelince
                dar kapsamlı değeri geniş kapsamlı variable'a atamak istersek
                Java bu işlemi otomatik olarak yapar.
                Bu işleme "AUTO WIDENING"(OTOMATİK GENİŞLETME) denir.


         */


        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        // bir variable'a baska data turundeki bir deger ATANABILIR MI?


       // bl = chr ; 'Bir'
       // bl = byt; // 24
       // bl = shrt; // 23
       // bl = sayiInt; // 30
      //  bl = str; "Java Candir"

           // boolen data türü sadce true veya false kabul eder.
           // başka hiçbir veri türündeki değeri kabul etmez.


        // str = bl; // true
//         str = byt; // 24
//         str = chr; // 'a'
//         str = shrt; // 23
//         str = lng; // 40


        //Strıng data türü sadce metin değerler kabul eder.
        //atanan değerler " " içinde olmalı
        //başka hiçbir data türündeki değer DİREK olarak  Strıng variable'a atanamaz



        // chr = bl ; doğru
        // chr = flt ; 3.5 F
        // chr = dbl ; // 4,5
        // chr = str ; "Java Candır." ;
        // chr = sayıInt ;
        // chr = byt ;
        // chr = short ;


        // char data türü ÖZEL bir kullanıma sahiptir.
        // tam sayı değeri barındıran data turleri ile özel durumlarda casting yapabilir.
        // ama double, float, boolean veya String ile casting olmaz






  //      byt = shrt; // 23
//        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5
//
          shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;
//
          sayiInt = byt;
          sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;
//
           lng = byt;
           lng = shrt;
           lng = sayiInt;
//        lng = flt;
//        lng = dbl;

          flt = byt;
          flt = shrt;
          flt = sayiInt;
          flt = lng;
//        flt = dbl;

           dbl = byt;
           dbl = shrt;
           dbl = sayiInt;
           dbl = lng;
           dbl = flt;





    }
}
