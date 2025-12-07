package jobsheet12;
import java.util.Scanner;
public class RekapPenjualanCafe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] dataPenjualan = new int[5][7];
        int[] totalPerMenu = new int[5];
        inputData(input, dataPenjualan);
        tampilData(dataPenjualan, totalPerMenu);
        menuTertinggi(dataPenjualan, totalPerMenu);
        rataPenjualan(totalPerMenu);
        input.close();
    }
    public static void inputData (Scanner input, int[][] dataPenjualan){
        for (int i = 0; i < 7; i++) {
            System.out.println("Masukkan data penjualan untuk hari ke-" + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Menu ke-" + (j + 1) + ": ");
                dataPenjualan[j][i] = input.nextInt();
            }
        }
    }
    public static void tampilData (int[][] dataPenjualan, int[] totalPerMenu){
        System.out.println("\nRekapitulasi Penjualan Cafe:");
        System.out.println("Menu\\Hari\t1\t2\t3\t4\t5\t6\t7\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Menu " + (i + 1) + "\t\t");
            int totalMenu = 0;
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
                totalMenu += dataPenjualan[i][j];
            }
            totalPerMenu[i] = totalMenu;
            System.out.println(totalMenu);
        }
    }
    public static void menuTertinggi (int[][] dataPenjualan, int[] totalPerMenu){
        int menuTertinggi = 0;
        for (int i = 1; i < totalPerMenu.length; i++) {
            if (totalPerMenu[i] > totalPerMenu[menuTertinggi]) {
                menuTertinggi = i;
            }
        } System.out.println("Menu dengan penjualan tertinggi adalah Menu " + (menuTertinggi + 1) + " dengan total penjualan " + totalPerMenu[menuTertinggi]);
    }
    public static void rataPenjualan (int[] totalPerMenu){
        for (int i = 0; i < totalPerMenu.length; i++) {
            double rataRata = totalPerMenu[i] / 7.0;
            System.out.println("Rata-rata penjualan Menu " + (i + 1) + ": " + rataRata);
        }
    }
}
