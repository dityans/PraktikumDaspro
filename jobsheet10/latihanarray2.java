package jobsheet10;
import java.util.Scanner;
public class latihanarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[10][6];
        double [] rataResponden = new double[10];
        double [] rataPertanyaan = new double[6];
        double rataKeseluruhan;
        double totalNilai = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai responden ke-"+(i+1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukan nilai untuk pertanyaan ke-"+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                if (nilai[i][j] < 1 || nilai[i][j] > 5) {
                    System.out.println("Nilai harus antara 1-5, silakan masukkan kembali.");
                    j--; // ulangi input untuk pertanyaan yang sama
                }
            }
            System.out.println();
        } for (int i = 0; i < rataResponden.length; i++) {  //menghitung rata-rata per responden
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            rataResponden[i] = total / nilai[i].length;
            System.out.print("Rata-rata nilai responden ke-"+(i+1)+": ");
            System.out.println(rataResponden[i]);
        } System.out.println();
        for (int i = 0; i < rataPertanyaan.length; i++) { //menghitung rata-rata per pertanyaan
            System.out.print("Rata-rata nilai pertanyaan ke-"+(i+1)+": ");
            int total = 0;
            for (int j = 0; j < nilai.length; j++) {
                total += nilai[j][i];
            }
            rataPertanyaan[i] = total / nilai.length;
            System.out.println(rataPertanyaan[i]);
        } System.out.println();
        for (int i = 0; i < nilai.length; i++) {          //menghitung total nilai keseluruhan
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            } 
        } rataKeseluruhan = totalNilai / (nilai.length * nilai[0].length); //menghitung rata-rata keseluruhan
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
        sc.close();
    }
}
