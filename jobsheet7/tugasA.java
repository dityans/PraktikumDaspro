package jobsheet7;
import java.util.Scanner;
public class tugasA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String jenisKelamin,nama;

        while (n<30) {
            System.out.print("Masukan nama anda: ");
            nama = sc.nextLine();
            System.out.print("Masukan jenis kelamin anda: ");
            jenisKelamin = sc.nextLine();
            if (jenisKelamin.equalsIgnoreCase("perempuan")){
                System.out.println(nama);
            }
            n++;
        }
        sc.close();
    }
}
