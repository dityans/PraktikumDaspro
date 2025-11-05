public class tugas2 {
       public static void main(String[] args) {
        int i, j,n, k = 0;
        for (i = 1; i<=5; i++) {
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            for (j = 1; j <= i; j++) {
                n = (j*j);
                k += n;
                System.out.print(n);

                if (j<i){
                System.out.print( " + ");
                }
            }
            if (k != 1) {
                System.out.print(" = " + k);
                k=0;
                System.out.println();
            }
            else {System.out.println();}
        }
    } 
}
