package jobsheet6;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double tarifListrik = 1500, pajak = 0.1, tarifTetap = 50000;
        double dayaListrik, totalBiaya, biayaSetelahPajak;

        System.out.print("Masukan banyak penggunaan listrik(kwh): ");
        dayaListrik = sc.nextDouble();
        System.out.print("Masukan daya listrik yang anda gunakan(VA): ");
        int opsiDaya = sc.nextInt();

        if (opsiDaya == 900){
            tarifListrik = 1300;
            totalBiaya = tarifTetap + (tarifListrik*dayaListrik);
            biayaSetelahPajak = totalBiaya + (totalBiaya*pajak);

            System.out.print("Total biaya listrik anda sebesar Rp." + biayaSetelahPajak);
   
        }
        else if (opsiDaya == 1300 || opsiDaya == 2200){
            tarifListrik =  1500;
            totalBiaya = tarifTetap + (tarifListrik*dayaListrik);
            biayaSetelahPajak = totalBiaya + (totalBiaya*pajak);

            System.out.print("Total biaya listrik anda sebesar Rp." + biayaSetelahPajak);
        }
        else if (opsiDaya == 3500 || opsiDaya == 5500){
            tarifListrik = 1700;
            totalBiaya = tarifTetap + (tarifListrik*dayaListrik);
            biayaSetelahPajak = totalBiaya + (totalBiaya*pajak);

            System.out.print("Total biaya listrik anda sebesar Rp." + biayaSetelahPajak);
        }
        else {
            System.out.println("Daya listrik yang anda masukkan tidak valid.");
        }
    sc.close();
        
    }
}