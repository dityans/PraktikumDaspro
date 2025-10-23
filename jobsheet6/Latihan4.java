package jobsheet6;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaSewa;
        double jarakTempuh, biayaSewa = 300000, biayaSupir = 200000, biayaBBM = 1000, totalBiaya;
        String bensin;
        
        System.out.print("Masukan lama menyewa : ");        
        lamaSewa = sc.nextInt();
        System.out.print("Masukan jarak tempuh (Km): ");
        jarakTempuh = sc.nextDouble(); sc.nextLine();
        System.out.print("Masukan bahan bakar yang anda gunakan: ");
        bensin = sc.nextLine();
    
        if (bensin.equalsIgnoreCase("pertalite")){
            biayaBBM = 1000;
        }
        else if (bensin.equalsIgnoreCase("pertamax")){
            biayaBBM = 1300;
        }
        else {
            System.out.println("Bensin yang anda masukan tidak valid.(sistem menggunakan harga bensin pertalite)");
        }

        if (lamaSewa > 30){
            System.out.println("Lama sewa maksimal 30 hari");
        }
        else {
            totalBiaya = (biayaSewa * lamaSewa) + (biayaSupir * lamaSewa) + (jarakTempuh * biayaBBM);

            if (totalBiaya > 2000000){
            double diskon = (totalBiaya * 0.05);
            totalBiaya -= diskon;
            System.out.println("Anda mendapat diskon sebesar " + diskon);
            }
            System.out.println("Total biaya sewa anda sebesar Rp." + totalBiaya);
        }

        sc.close();
    }
}