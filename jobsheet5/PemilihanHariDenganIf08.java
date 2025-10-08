package jobsheet5;

import  java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan nomor hari: ");
        int nomorHari = sc.nextInt();

        if ((nomorHari>=1)&&(nomorHari<=5)){
            System.out.println("Weekday");
        }
        else if ((nomorHari <= 7)&&(nomorHari >= 6)){
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
