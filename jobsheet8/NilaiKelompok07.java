import java.util.Scanner;
public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, totalNilai, rataNilai;
        int i = 1, j;
        double tertinggi = 0;
        int kelompok = 0;  
        while (i<=6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (j = 1;j<=5;j++) {
                System.out.print("Masukan nilai anggota ke-" + j + ": ");
                nilai = input.nextDouble();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelompok = i;
            }
            System.out.println("Rata-rata: "+ rataNilai);
            i++; 
        }
        System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah Kelompok " + kelompok);
        System.out.println("Nilai rata-rata tertinggi: " + tertinggi);
        input.close();
    }
}
