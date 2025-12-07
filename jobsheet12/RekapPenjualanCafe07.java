package jobsheet12;
import java.util.Scanner;
public class RekapPenjualanCafe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah hari yang akan direkap: ");
        int hari = input.nextInt();
        System.out.print("Masukan jumlah menu yang akan direkap: ");
        int menu = input.nextInt();
        int[][] dataPenjualan = new int[menu][hari];
        int[] totalTiapMenu = new int[menu];
        inputData(input, dataPenjualan, menu, hari);
        tampilData(dataPenjualan, totalTiapMenu, menu, hari);
        menuTertinggi(dataPenjualan, totalTiapMenu);
        rataPenjualan(totalTiapMenu, hari);
        input.close();
    }
    public static void inputData (Scanner input, int[][] dataPenjualan, int menu, int hari){
        for (int i = 0; i < hari; i++) {
            System.out.println("Masukkan data penjualan untuk hari ke-" + (i + 1) + ":");
            for (int j = 0; j < menu; j++) {
                System.out.print("Menu ke-" + (j + 1) + ": ");
                dataPenjualan[j][i] = input.nextInt();
            }
        }
    }
    public static void tampilData (int[][] dataPenjualan, int[] totalTiapMenu, int menu, int hari){
        System.out.println("\nRekapitulasi Penjualan Cafe:");
        System.out.print("Menu/Hari");
        for (int i = 0; i < hari; i++) {
            System.out.print("\tHari " + (i + 1));
        }
        System.out.println("\tTotal");
        for (int i = 0; i < menu; i++) {
            System.out.print("Menu " + (i + 1) + "\t\t");
            int totalMenu = 0;
            for (int j = 0; j < hari; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
                totalMenu += dataPenjualan[i][j];
            }
            totalTiapMenu[i] = totalMenu;
            System.out.println(totalMenu);
        }
    }
    public static void menuTertinggi (int[][] dataPenjualan, int[] totalTiapMenu){
        int menuTertinggi = 0;
        for (int i = 1; i < totalTiapMenu.length; i++) {
            if (totalTiapMenu[i] > totalTiapMenu[menuTertinggi]) {
                menuTertinggi = i;
            }
        } System.out.println("Menu dengan penjualan tertinggi adalah Menu " + (menuTertinggi + 1) + " dengan total penjualan " + totalTiapMenu[menuTertinggi]);
    }
    public static void rataPenjualan (int[] totalTiapMenu, double hari){
        for (int i = 0; i < totalTiapMenu.length; i++) {
            double rataRata = totalTiapMenu[i] / hari;
            System.out.println("Rata-rata penjualan Menu " + (i + 1) + ": " + rataRata);
        }
    }
}
