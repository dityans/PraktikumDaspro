import java.util.Scanner;
public class NilaiKelompok07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, totalNilai, rataNilai;
        int i = 1, j;
        while (i<=6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (j = 1;j<=5;j++) {
                System.out.print("Masukan nilai anggota ke-" + j + ": ");
                nilai = input.nextDouble();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: "+ rataNilai);
            i++;   
        }
        input.close();
    }
}
