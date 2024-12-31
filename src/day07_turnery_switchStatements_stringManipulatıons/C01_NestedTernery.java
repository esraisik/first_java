package day07_turnery_switchStatements_stringManipulatıons;

import java.util.Scanner;

public class C01_NestedTernery {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println(sayi > 0 ? "pozitif" : (sayi < 0 ? "negatif" : "notr"));


        System.out.println(sayi > 0 ? "pozitif" : sayi < 0 ? "negatif" : "notr");


        //Kullanıcıdan bir sayı isteyin
        //0'dan buyukse pozıtıf,
        //0'dan kucukse negatif,
        //0 ise notr yazdırın


        System.out.println(sayi > 0 ? "pozitif" : "pozitif degil");


        // sayi, 0'dan buyukse pozitif,
        // 0'dan kucukse negatif,
        // 0 ise notr yazdirin

        System.out.println(sayi > 0 ? "pozitif" : (sayi < 0 ? "negatif" : "notr"));


        System.out.println(sayi > 0 ? "pozitif" : sayi < 0 ? "negatif" : "notr");


    }


}
