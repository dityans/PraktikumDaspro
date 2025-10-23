package jobsheet6;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamaSewa;
        double jarakTempuh, biayaSewa = 300000, biayaSupir = 200000, biayaBBM, totalBiaya;
        String bensin;
        
        System.out.print("Masukan lama menyewa : ");        
        lamaSewa = sc.nextInt();
        System.out.print("Masukan jarak tempuh (Km): ");
        jarakTempuh = sc.nextDouble();
        sc.nextLine();
        System.out.print("Masukan bahan bakar yang anda gunakan: ");
        bensin = sc.nextLine();


        if (bensin.equalsIgnoreCase("pertalite")){
            biayaBBM = 1000;
            totalBiaya = (biayaSewa * lamaSewa) + (biayaSupir * lamaSewa) + (jarakTempuh * biayaBBM);
            System.out.println("Total biaya sewa sebesar Rp." + totalBiaya);
        }
        else if (bensin.equalsIgnoreCase("pertamax")){
            biayaBBM = 1300;
            totalBiaya = (biayaSewa * lamaSewa) + (biayaSupir * lamaSewa) + (jarakTempuh * biayaBBM);
            System.out.println("Total biaya sewa sebesar Rp." + totalBiaya);
        }
        else {
            System.out.println("Bensin yang anda masukan tidak valid.");
        }

        sc.close();
    }
}