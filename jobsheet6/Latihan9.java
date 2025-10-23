package jobsheet6;

import java.util.Scanner;

public class Latihan9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaCetakPerHalaman = 200;
        int biayaCover = 0;
        double beratPerLembar = 0.003; // dalam kilogram
        double beratCover = 0;
        double beratPacking = 0.300; // dalam kilogram
        int ongkirPerKilo = 15000; // ongkir per kilogram
        int jumlahHalaman;
        double totalBiaya, totalBerat, ongkir;

        System.out.print("Masukan jumlah halaman buku: ");
        jumlahHalaman = sc.nextInt(); sc.nextLine();
        System.out.print("Masukan jenis cover (Hard/Soft): ");
        String jenisCover = sc.nextLine();
        System.out.print("Masukan alamat tujuan: ");
        String alamat = sc.nextLine();

        
        if(jenisCover.equalsIgnoreCase("hard")){
            biayaCover = 20000;
            beratCover = 0.25;
        }
        else if (jenisCover.equalsIgnoreCase("soft")){
            biayaCover = 10000;
            beratCover = 0.1;
        }
        totalBerat = (beratPerLembar*Math.ceil(jumlahHalaman/2)) + beratCover +beratPacking;
        ongkir = Math.ceil(totalBerat)*ongkirPerKilo;

        switch (alamat) {
            case "malang":
            case "batu":
                ongkir = 20000;
                break;
        
            default:
                break;
        }
        
        totalBiaya = (biayaCetakPerHalaman*jumlahHalaman) + biayaCover + ongkir;
        
        System.out.println("Total berat buku:" + totalBerat);
        System.out.println("Ongkir yang harus dibayar: Rp." + ongkir);
        System.out.println("Total biaya buku dan pengiriman buku anda adalah Rp." + totalBiaya);

        sc.close();
    }
}
