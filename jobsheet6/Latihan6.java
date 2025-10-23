package jobsheet6;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double tarifListrik = 1500, pajak = 0.1, tarifTetap = 50000;
        double dayaListrik, totalBiaya, biayaSetelahPajak;

        System.out.print("Masukan banyak penggunaan listrik(kwh): ");
        dayaListrik = sc.nextDouble();
        System.out.print("Masukan daya listrik yang anda gunakan(VA): ");
        int opsiDaya = sc.nextInt();

        switch(opsiDaya){
            case 900 : 
                tarifListrik = 1300;
                break;
            case 1300 :
            case 2200 :
                tarifListrik = 1500;
                break;
            case 3500 :
            case 5500 :
                tarifListrik = 1700;
            default :
                System.out.println("Daya listrik yang anda gunakan tidak valid");
        }

        totalBiaya = tarifTetap + (tarifListrik*dayaListrik);
        biayaSetelahPajak = totalBiaya + (totalBiaya*pajak);

        System.out.print("Total biaya listrik anda sebesar Rp." + biayaSetelahPajak);
        sc.close();
    }
}