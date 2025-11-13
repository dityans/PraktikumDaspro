package jobsheet9;
import java.util.Scanner;
public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[10];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) 
            System.out.println("Nilai akhir ke-" + i + " adalah: " + nilai[i]);
        }
        sc.close();
    }
}
