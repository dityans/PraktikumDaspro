package jobsheet9;
import java.util.Scanner;
public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah: " + nilai[i]);
        }
        sc.close();
    }
}
