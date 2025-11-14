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
        int tertinggi = 0;
        int terendah = 100;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]> 70){               //nilai diatas 70 lulus
                totalLulus += nilaiMhs[i];
                lulus++;
            }else if (nilaiMhs[i] <= 70){       //nilai 70 ke bawah tidak lulus
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }if (nilaiMhs[i] > tertinggi){      //mencari nilai tertinggi
                tertinggi = nilaiMhs[i];
            }else if (nilaiMhs[i] < terendah){  //mencari nilai terendah
                terendah = nilaiMhs[i];
            }
        }
        rata2Lulus = totalLulus / lulus;
        rata2TdkLulus = totalTdkLulus / tdkLulus;
        System.out.println("Rata-rata nilai lulus= " + rata2Lulus );
        System.out.println("Rata-rata nilai tidak lulus= " + rata2TdkLulus );
        System.out.println("Nilai tertinggi= " + tertinggi);
        System.out.println("Nilai terendah= " + terendah);
        sc.close();
    }
}
