package jobsheet12;

public class pengunjungKafe07 {
    static void daftarPengunjung (String ... namaPengunjung) {
        System. out.println ("Daftar Nama Pengunjung: ");
        for(String pengunjung : namaPengunjung) {
            System. out.println ("- "+ pengunjung);
        }
    }
    public static void main(String[] args) {
        // daftarPengunjung ("Andi", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}