public class tugas1B {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i<10; i++) {       // loop baris
            for (j = 9; j > i; j--) {     // cetak spasi dulu
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
