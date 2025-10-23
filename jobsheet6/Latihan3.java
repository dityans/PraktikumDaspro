package jobsheet6;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaSewa;
        double jarakTempuh, biayaSewa = 300000, biayaSupir = 200000, biayaBBM = 1000, totalBiaya;

        System.out.print("Masukan lama menyewa : ");        
        lamaSewa = sc.nextInt();
        System.out.print("Masukan jarak tempuh (Km): ");
        jarakTempuh = sc.nextDouble();

        if (lamaSewa > 30){
            System.out.println("Lama sewa maksimal 30 hari");
        }
        else {
        totalBiaya = (biayaSewa * lamaSewa) + (biayaSupir * lamaSewa) + (jarakTempuh * biayaBBM);

        System.out.println("Total biaya sewa anda sebesar Rp." + totalBiaya);
        }
        
        sc.close();
    }
}