public class tugas2 {
       public static void main(String[] args) {
        int i, j,n;
        for (i = 1; i<=5; i++) {
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            int total = 0;
            for (j = 1; j <= i; j++) {
                n = (j*j);
                total += n;
                System.out.print(n);

                if (j<i){
                System.out.print( " + ");
                }
            }
            if (total != 1) {
                System.out.println(" = " + total);
            }
            else {
                System.out.println();
            }
        }
    } 
}
