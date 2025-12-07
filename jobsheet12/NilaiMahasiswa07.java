package jobsheet12;
import java.util.Scanner;
public class NilaiMahasiswa07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        isianArray(input, n, nilai);
        tampilArray(n, nilai);
        int totalNilai = hitTot(n, nilai);
        System.out.println("Total nilai semua mahasiswa: " + totalNilai);
    }
    public static void isianArray (Scanner input, int n, int[] nilai) {
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }
    public static void tampilArray (int n, int[] nilai) {
        System.out.println();
        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }
    public static int hitTot (int n, int[] nilai) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nilai[i];
        }
        return total;
    }
}
