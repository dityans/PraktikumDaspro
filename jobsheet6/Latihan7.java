package jobsheet6;
import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        double bPublikasi = 300000, bDekorasi = 500000, bKonsumPanitiaJuri = 500000, bHadiah = 4000000, 
                bOperasional = 500000, bKonsumPeserta = 25000, bHonorarium = 75000;
        double bnykTim;
        double danaPendaftaran = 50000, danaPolinema=0;
        double jumlahDanaSponsor, totalBiaya, tDanaPendaftaran, tDanaPolinema;
        
        System.out.print("Masukan banyak tim: ");
        bnykTim = sc.nextDouble();sc.nextLine();
        System.out.print("Apakah polinema bersedia memberikan anggaran? (ya/tidak)");
        String polinemaBersedia = sc.nextLine();
        if (polinemaBersedia.equalsIgnoreCase("ya")){
            System.out.print("Masukkan persentase bantuan dana dari Polinema (1-100): ");
            danaPolinema = sc.nextDouble();
            System.out.println("Persentase bantuan dana dari Polinema: " + danaPolinema + "%");
            danaPolinema = danaPolinema / 100;
        }
        else if (polinemaBersedia.equalsIgnoreCase("tidak")){
            System.out.println("Polinema tidak memberikan anggaran");
        }

        totalBiaya = bPublikasi + bDekorasi + bKonsumPanitiaJuri + bHadiah + bOperasional + (bKonsumPeserta*bnykTim*3) +
         (bHonorarium*bnykTim);
        tDanaPendaftaran = danaPendaftaran * bnykTim;
        tDanaPolinema = danaPolinema * totalBiaya;
        jumlahDanaSponsor = totalBiaya - (tDanaPolinema + tDanaPendaftaran);

        if (jumlahDanaSponsor<=0){
            System.out.println("Tidak perlu sponsor, uang sudah cukup.");
        }
        else {
            System.out.print("Jumlah dana sponsor yang diperlukan Rp." + jumlahDanaSponsor);
        }
        sc.close();
    }
}

