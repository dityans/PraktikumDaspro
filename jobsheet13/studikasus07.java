package jobsheet13;
import java.util.Scanner;

public class studikasus07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean keluar = true;
        String [] daftarNama = new String[50];
        String [] daftarNim = new String[50];   
        double [] daftarIpk = new double[50];
        String [] daftarBeasiswaMhs = new String[50];
        int[] penghasilanOrtu = new int[50];
        String [] jenisBeasiswa = {"Reguler", "Unggulan", "Riset"};
        do{
            System.out.println("=== Sistem Pendaftaran Beasiswa ===");
            System.out.println("1. Tambah Data Pendaftar");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Tampil Data Pendaftar Berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-Rata per jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (pilihan) {
                case 1:
                    tambahData(sc, daftarNama, daftarNim, daftarIpk, daftarBeasiswaMhs, penghasilanOrtu);
                    break;
                case 2:
                    tampilkanSemuaPendaftar(daftarNama, daftarNim, daftarIpk, daftarBeasiswaMhs, penghasilanOrtu);
                    break;
                case 3:
                    tampilDataBerdasarkanJenisBeasiswa(sc, daftarNama, daftarNim, daftarIpk, daftarBeasiswaMhs, penghasilanOrtu, jenisBeasiswa);
                    break;
                case 4:
                    hitungRataRataPerJenisBeasiswa(daftarIpk, daftarBeasiswaMhs, jenisBeasiswa);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    keluar = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (keluar);
    }
    public static void tambahData(Scanner sc, String[] daftarNama, String[] daftarNim, double[] daftarIpk, String[] daftarBeasiswaMhs, int [] penghasilanOrtu) {
        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("IPK terakhir: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
        String jenisBeasiswa = sc.nextLine();
        System.out.print("Penghasilan Orang Tua per Bulan: ");
        int penghasilan = sc.nextInt();
        sc.nextLine(); // Consume newline
        for (int i = 0; i < penghasilanOrtu.length; i++) {
            if (penghasilan > 2000000){
                System.out.println("Pendaftaran dibatalkan karena penghasilan orang tua melebihi batas.");
                break;
            }
            if (daftarNama[i] == null) {
                daftarNama[i] = nama;
                daftarNim[i] = nim;
                daftarIpk[i] = ipk;
                daftarBeasiswaMhs[i] = jenisBeasiswa;
                penghasilanOrtu[i] = penghasilan;
                break;
            }
        }
    }
    public static void tampilkanSemuaPendaftar(String[] daftarNama, String[] daftarNim, double[] daftarIpk, String[] daftarBeasiswaMhs, int [] penghasilanOrtu) {
        if (daftarNama[0] == null) {
            System.out.println("Tidak ada data pendaftar.");
        }else {
            System.out.println("=== Daftar Semua Pendaftar Beasiswa ===");
            System.out.println("Nama\tNIM\tIPK\tJenis Beasiswa\tPenghasilan Orang Tua");
            for (int i = 0; i < daftarNama.length; i++) {
                if (daftarNama[i] == null) {
                    break;
                }
                System.out.println(daftarNama[i] + "\t" + daftarNim[i] + "\t" + daftarIpk[i] + "\t" + daftarBeasiswaMhs[i] + "\t" + penghasilanOrtu[i]);
            }
        }
    }
    public static void tampilDataBerdasarkanJenisBeasiswa(Scanner sc,String[]  daftarNama, String[] daftarNim, double[] daftarIpk, String[] daftarBeasiswaMhs, int[] penghasilanOrtu, String[] jenisBeasiswa) {
        System.out.println("=== Tampil Data Pendaftar Berdasarkan Jenis Beasiswa ===");
        System.out.println("Jenis Beasiswa yang ingin ditampilkan: ");
        String pilihanBeasiswa = sc.nextLine();
        System.out.println("=== Daftar Pendaftar Beasiswa " + pilihanBeasiswa + " ===");
        System.out.println("Nama\tNIM\tIPK\tPenghasilan Orang Tua");
        for (int j = 0; j < jenisBeasiswa.length; j++) {
            if (pilihanBeasiswa.equalsIgnoreCase(jenisBeasiswa[j])) {
                for (int i = 0; i < daftarBeasiswaMhs.length; i++) {
                    if (daftarBeasiswaMhs[i] == null) {
                        break;
                    }
                    if (daftarBeasiswaMhs[i].equalsIgnoreCase(jenisBeasiswa[j])) {
                        System.out.println(daftarNama[i] + "\t" + daftarNim[i] + "\t" + daftarIpk[i] + "\t" + penghasilanOrtu[i]);
                    } else {
                        continue;
                    }
                }
            }
            else if (!pilihanBeasiswa.equalsIgnoreCase(jenisBeasiswa[j])) {
                continue;
            }
        System.out.println();
        }
    }
    public static void hitungRataRataPerJenisBeasiswa(double[] daftarIpk, String[] daftarBeasiswaMhs, String[] jenisBeasiswa) {
        for (int j = 0; j < jenisBeasiswa.length; j++) {
            double totalIpk = 0;
            int count = 0;
            for (int i = 0; i < daftarBeasiswaMhs.length; i++) {
                if (daftarBeasiswaMhs[i] == null) {
                    break;
                }
                if (daftarBeasiswaMhs[i].equalsIgnoreCase(jenisBeasiswa[j])) {
                    totalIpk += daftarIpk[i];
                    count++;
                }
            }
            if (count > 0) {
                double rataRata = totalIpk / count;
                System.out.println("Rata-rata IPK untuk Beasiswa " + jenisBeasiswa[j] + ": " + rataRata);
            } else {
                System.out.println("Tidak ada pendaftar untuk Beasiswa " + jenisBeasiswa[j]);
            }
        }
    }
}

