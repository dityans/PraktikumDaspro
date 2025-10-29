package jobsheet7;
import java.util.Scanner;
public class KafeDoWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.print("Masukan nama pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalakan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println( "Total harga yang harus dibayar: " + totalHarga);
            sc.nextLine();
        } while(true);
        sc.close();
    }
}
