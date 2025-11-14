package jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2Lulus;
        double rata2TdkLulus;
        int lulus = 0;
        int tdkLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]> 70){
                totalLulus += nilaiMhs[i];
                lulus++;
            }else if (nilaiMhs[i] <= 70){
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        rata2Lulus = totalLulus / lulus;
        rata2TdkLulus = totalTdkLulus / tdkLulus;
        System.out.println("Rata-rata nilai lulus= " + rata2Lulus );
        System.out.println("Rata-rata nilai tidak lulus= " + rata2TdkLulus );
        sc.close();
    }
}
