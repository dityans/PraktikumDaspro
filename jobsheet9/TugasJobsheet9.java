package jobsheet9;
import java.util.Scanner;
public class TugasJobsheet9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"} ;
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};
        double totalPembayaran = 0;
        int jmlMenu;
        do{
            System.out.print("Masukan jumlah menu yang ingin diinput (ketik 0 untuk keluar): ");
            jmlMenu = sc.nextInt();
            if (jmlMenu == 0) {
                break;
            }
            String[] daftarPesanan = new String[menu.length];
            int jmlItem;
            for (int i = 0; i < jmlMenu; i++) {
                sc.nextLine();
                System.out.print("Masukan menu ke-" + (i+1) + ": ");
                String pesanan = sc.nextLine();      
                for (int j = 0; j < menu.length; j++) {
                    if (pesanan.equalsIgnoreCase(menu[j])) {
                        daftarPesanan[j] = pesanan;
                        System.out.print("Masukan jumlah item: ");
                        jmlItem = sc.nextInt();
                        totalPembayaran += daftarHarga[j] * jmlItem;
                        break;
                    } else if (j == menu.length - 1) {
                        System.out.println("Menu tidak tersedia"); 
                        i--;
                        }
                    }            
                }  
            System.out.println("Total pembayaran: Rp." + totalPembayaran);
        } while (jmlMenu != 0);
        sc.close();
    }
}
