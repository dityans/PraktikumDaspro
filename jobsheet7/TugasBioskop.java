package jobsheet7;
import java.util.Scanner;
public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaTiket = 50000, jmlTiket, totalBayar, omset = 0;
        int totalTiket = 0, i = 1;

        while (true) {
            System.out.print("Masukan jumlah tiket pelanggan ke-" + i + " (ketik -99 untuk mengakhiri transaksi): ");
            jmlTiket = sc.nextDouble();
            if (jmlTiket > 4 && jmlTiket <10) {
                totalBayar = (jmlTiket*hargaTiket) - ((jmlTiket*hargaTiket) * 0.1);
            }
            else if (jmlTiket > 10) {
                totalBayar = (jmlTiket*hargaTiket) - ((jmlTiket*hargaTiket) * 0.15);
            }
            else if(jmlTiket==-99){
                break;
            }
            else if (jmlTiket<0){
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }
            else {
                totalBayar = (jmlTiket*hargaTiket);
            }
            omset += totalBayar;
            totalTiket += jmlTiket;
            System.out.println(totalBayar);
            i++;
        } 
        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total omset penjualan tiket: " + omset);

        sc.close();
    }
}
