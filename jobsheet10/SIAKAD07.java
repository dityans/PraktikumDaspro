package jobsheet10;
import java.util.Scanner;
public class SIAKAD07 {
    public static void main(String[] args) {
        int[][] nilai = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("nilai rata-rata:" + totalPerSiswa / nilai[i].length);
        } sc.close();
        System.out.println("\n================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            double rataRata = totalPerMataKuliah / nilai.length;
            System.out.printf("Mata Kuliah %d: %.2f%n", (j+1), rataRata);
        }
    }
}
