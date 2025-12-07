package jobsheet12;

import java.util.Scanner;

public class HitungBalok07 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in) ;
        int p, l, t, L, vol;

        System. out.println ("Masukkan panjang") ;
        p = input.nextInt () ;

        System. out.println ("Masukkan lebar") ;
        l = input.nextInt () ;

        System. out.println ("Masukkan tinggi");
        t = input.nextInt () ;

        L = hitungLuas (p, l) ;
        System. out.println ("Luas persegi panjang adalah " + L) ;
        vol = hitungVolume (p, l, t) ;
        System. out.println ("Volume balok adalah " + vol) ;

        input. close () ;

    }
    static int hitungLuas (int p, int l) {
        int luas = p * l;
        return luas;
    }
    static int hitungVolume (int p, int l, int t) {
        int volume = p * l * t;
        return volume;
    }   
}
