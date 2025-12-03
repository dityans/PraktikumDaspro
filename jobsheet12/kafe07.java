package jobsheet12;

public class kafe07 {
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
}
    public static void main(String[] args) {
       Menu("Andi", true, "DISKON30");
    }
}
