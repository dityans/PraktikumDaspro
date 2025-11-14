package jobsheet9;
import java.util.Scanner;
public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang diinput: ");
        int jmlMhs = sc.nextInt();
        int[] arrNilai = new int[jmlMhs];
        int hasil = 0;
        
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        } 
        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i+1;
                break;
            }else if (i == arrNilai.length - 1) {
                System.out.println();
                System.out.println("Nilai " + key + " tidak ditemukan");
                System.out.println();
                sc.close();
                return;
            }
        }
        System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        System.out.println();
        sc.close();
    }
}
