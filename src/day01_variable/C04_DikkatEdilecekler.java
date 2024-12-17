package day01_variable;

public class C04_DikkatEdilecekler {


    public static void main(String[] args) {

        // 1- deklarasyon bir kere olur, deger ataması istediğiniz kadar yapılabilir

        int sayi=30;

        // ins sayi=40; // Variable 'sayi' is already defined  in the scope

        // double sayi == 34.6 //  Variable 'sayi' is already defined  in the scope

        sayi=45;

        sayi= sayi+4;

        sayi= sayi+5;

        //2- Esitliğin sol tarafında SADECE variable ismi olur
        // baska bir sey kullanılmasına Java izin vermez

        // 50= sayi; // Variable expected
        // sayi+2 =sayi // Variable expected


        int sayi1=34;

        // sayi+sayi1= 45; Variable expected

        //3- Java'da kullanılan = işareti,
        // matematikteki = işareti gibi eşitliği kontrol etmez
        // görevi assigment (atama)'dir
        // Java önce ='in sağındaki değeri hesaplar
        // bulduğu değeri saoldaki variable'a ATAMA yapar.





















    }
}
