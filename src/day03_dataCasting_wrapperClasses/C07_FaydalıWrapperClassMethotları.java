package day03_DataCasting_wrapperClasses;

public class C07_FaydalıWrapperClassMethotları {

    public static void main(String[] args) {

      //  double fiyat1 = "$21.28" ; olmaz

       // String fiyat1="$21.28" ;
       // String fiyat2 ="$15.46" ;     // iki durumda da $ olduğu için metin gibi düşünerek String ile yazıldı


        String fiyat1 ="21.28" ;
        String fiyat2 ="15.46" ;

        // belirli formatta verilen iki fiyatın toplamını yazdırın.

        System.out.println( fiyat1 + fiyat2); //  21.2815.46

        double fyt1 = Double.parseDouble(fiyat1);
        double fyt2 = Double.parseDouble(fiyat2) ;

        System.out.println("Fiyatlarin toplamı" + (fyt1+fyt2)); // 36.74

        fiyat1 ="45" ;
        fiyat2="48" ;

        // fiyat1 fiyat2 'den küçükse true, küçük değilse false yazdırın.

       // System.out.println(fiyat1 < fiyat2); < işsareti String için kullanılamaz

        int fy1 = Integer.parseInt(fiyat1) ;
        int fy2 =Integer.valueOf(fiyat2) ;

        System.out.println(fy1 < fy2); // true

        // int bir sayının max kac olabileceğini yazdırın.

        System.out.println(Integer.MAX_VALUE); // 2147483647


        // short bir sayının min kac olabileceğini yazdırın.

        System.out.println(Short.MIN_VALUE); //-32768

        // Character claass'ında kullanılan özellikler

        char ch1='a' ;
        char ch2='K' ;

        // ch1'i buyuk harf olarak yazdırın.

        System.out.println(Character.toUpperCase(ch1)); // A

        // ch2'yi küçük harf olarak yazdırın.

        System.out.println(Character.toLowerCase(ch2));// k

        // ch1 sayı mı?

        System.out.println(Character.isDigit(ch1)); // false

        //ch2 büyük harf mi?

        System.out.println(Character.isUpperCase(ch2)); //true

        //ch2 harf mi?

        System.out.println(Character.isLetter(ch2)); //true


        //ch2 alfabetik mi?

        System.out.println(Character.isAlphabetic(ch2)); // true

    }
}
