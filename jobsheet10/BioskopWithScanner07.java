package jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String [4][2];
        System.out.println("Menu 1: Input Penonton");
        System.out.println("Menu 2: Tampilkan Penonton");
        System.out.println("Menu 3: Keluar");
        while (true) {
            System.out.print("Pilih menu (1-3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1:
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();
                    System. out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("--Daftar Penonton--");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.printf("%s \t", penonton[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Keluar dari program.");
                sc.close();
                return; 
            default:
                break;
            }
        }
    }
}
