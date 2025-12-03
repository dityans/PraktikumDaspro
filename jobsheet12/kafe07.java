package jobsheet12;
import java.util.Scanner;

public class kafe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON30");
        System.out.print("Masukan nomor menu yang dipesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukan banyak item yang dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukan kode promo (jika tidak ada, ketik 'NOPROMO'): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga07(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System. out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        String[] daftarKupon = {"DISKON50", "DISKON30"};
        int[] daftarDiskon = {50, 30};
        for (int i = 0; i < daftarKupon.length; i++) {
            if (kodePromo.equalsIgnoreCase(daftarKupon[i])) {
                System.out.println("Anda mendapat diskon sebanyak " + daftarDiskon[i] + "% dari kode promo " + kodePromo + "!");
                break;
            } else if (i == daftarKupon.length - 1) {
                System.out.println("Kode promo tidak valid.");
            }
        }
        System. out.println(" ===== MENU RESTO KAFE ===== ");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        System.out.println();
    }
    
    public static int hitungTotalHarga07(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem;
        String[] daftarKupon = {"DISKON50", "DISKON30"};
        int[] daftarDiskon = {50, 30};
        for (int i = 0; i < daftarKupon.length; i++) {
            if (kodePromo.equalsIgnoreCase(daftarKupon[i])) {
                hargaTotal -= (hargaTotal * daftarDiskon[i] / 100);
                break;
            }
        }
        return hargaTotal;
    }
}
