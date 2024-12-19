package day03_DataCasting_wrapperClasses;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        /*
         Explicit Narrowing yaptığımızda
         daha kapsamlı bir değeri, daha küçük kapsamlı bir variable'a atama yapıyoruz.

         değer variable'in sınırları içindeyse
         explicit narrowing yaptığımızda aynı değere sahip olur.

         ANNCAKK eğer değer variable'ın sınırlarından büyük ise
         bu durumda değer farklı bir sonuca dönüşebilir.
         */



        int sayi1 = 43;
        int sayi2 = 130 ;
        int sayi3 = 150 ;
        int sayi4 = 262 ;
        int sayi5 = 520 ;


        double dbl1 = 34.1;
        double dbl2 = 45.92;

       byte byt = 25;


        sayi1 = (int)dbl1;

        System.out.println("34.1'in int'a cast edilmiş hali : " + sayi1);
       // 34.1'in int'a cast edilmiş hali : 34

        sayi1 = (int)dbl2;
       System.out.println("45.92'in int'a cast edilmiş hali : " + sayi1);
        //45.92'in int'a cast edilmiş hali : 45

        sayi1 = 43;

        byt = (byte) sayi1;
        System.out.println("43'un byte'a cast edilmiş hali : " + byt);
        //43'un byte'a cast edilmiş hali : 43

        byt = (byte) sayi2;
       System.out. println("130'un byte'a cast edilmiş hali : " + byt);
       // 130'un byte'a cast edilmiş hali : -126

        byt = (byte) sayi3;
        System.out.println("150'nin byte'a cast edilmiş hali : " + byt);
        //150'nin byte'a cast edilmiş hali : -106

        byt = (byte) sayi4;
       System.out.println("262'nin byte'a cast edilmiş hali : " + byt);
        //262'nin byte'a cast edilmiş hali : 6


        byt = (byte) sayi5;
        System.out.println("520'nin byte'a cast edilmiş hali : " + byt);
       // 520'nin byte'a cast edilmiş hali : 8
































    }

}
