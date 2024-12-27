package day05_ifElseStatemant;

import java.util.Scanner;

public class C10_Buyukharf {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...:");

        char karakter = scanner.next().charAt(0);


        // 1.yontem ASCII table

        if (karakter >= 'A' && karakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }



        // 2.Wrapper Class kullanimi

        if (Character.isUpperCase(karakter)){
            System.out.println("Girilen karakter buyuk harf");
        }else System.out.println("Girilen karakter buyuk harf degil");




    }
}
