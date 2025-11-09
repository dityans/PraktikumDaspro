import java.util.Scanner;
public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, totalNilai, rataNilai;
        int i, j;
        double tertinggi = 0;
        int kelompok = 0;  
        for (i = 1; i<=6; i++) {
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
        }
        System.out.println("Kelompok dengan nilai rata-rata tertinggi adalah Kelompok " + kelompok);
        System.out.println("Nilai rata-rata tertinggi: " + tertinggi);
        input.close();
    }
}
