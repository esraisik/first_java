package day03_DataCasting_wrapperClasses;

public class C05_CharDataTuruIleCasting {

    public static void main(String[] args) {


        /*
            char data türü özel bir data türüdür
            Matematiksel işlemlerde kullanıldığında
            ASCII table'daki değerleri ile işleme girerler


            char data türündeki değerler ve variable'lar
            < , > gibi matematiksel işlemlerde de kullanılabilir
            bu durumda Java ASCII değerlerine bakar
            biz ise bunu önce mi veya sonra mi diye düşünebiliriz

         */






        String str1 = "Java" ;
       String str2 = " Candır" ;


       System.out.println( str1 + str2); // Java Candir

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out. println( chr1 + chr2 + chr3 ); // 97+98+99 ==> 294

        int sayi1 = 'c';

        System.out.println("sayi1'in değeri : " + sayi1); // sayi1'in değeri : 99


        System.out.println( 'a' < 'e' ); // 97 < 101 ==> true

        System.out.println( 'B' < 'b'); // 66 < 98 ==>  true

        System.out.println( 'g' < 't'); // true


        char verilenHarf = 'S';

        //verilen harf'den sonraki 3 harfi yazdirin

        System.out.println( verilenHarf + 1 );  //84

        System.out.println( (char)(verilenHarf+1) );  //T
        System.out.println( (char)(verilenHarf+2) ); // U
        System.out.println( (char)(verilenHarf+3) ); // V






















    }
}
