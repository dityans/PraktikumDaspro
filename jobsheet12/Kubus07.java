package jobsheet12; 
import java.util.Scanner;
public class Kubus07 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        int s, L, vol;
        System.out.print("Masukkan sisi kubus: ");        
        s = input.nextInt () ;

        L = hitungLuas (s) ;
        System. out.println ("Luas kubus adalah " + L) ;
        vol = hitungVolume (s) ;
        System. out.println ("Volume kubus adalah " + vol) ;
        input. close () ;
    }
    static int hitungLuas (int s) {
        int luas = 6 * s * s;
        return luas;
    }
    static int hitungVolume (int s) {
        int volume = s * s * s;
        return volume;
    }   
}
