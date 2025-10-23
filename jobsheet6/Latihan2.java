package jobsheet6;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaSewa;
        double jarakTempuh, biayaSewa = 300000, biayaSupir = 200000, biayaBBM = 1000, totalBiaya;

        System.out.print("Masukan lama menyewa : ");        
        lamaSewa = sc.nextInt();
        System.out.print("Masukan jarak tempuh (Km): ");
        jarakTempuh = sc.nextDouble();

        totalBiaya = (biayaSewa * lamaSewa) + (biayaSupir * lamaSewa) + (jarakTempuh * biayaBBM);

        if (totalBiaya > 2000000){
            double diskon = (totalBiaya * 0.05);
            totalBiaya -= diskon;
            System.out.println("Anda mendapat diskon sebesar " + diskon);
        }
        System.out.println("Total biaya sewa anda sebesar Rp." + totalBiaya);
        sc.close();
    }
}