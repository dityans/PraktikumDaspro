import java.util.Scanner;
public class tugas1Jobsheet {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai n: ");
        int n = input.nextInt();
        int i, j, kuadrat;
        for (i = 1; i<=n; i++) {
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            int total = 0;
            for (j = 1; j <= i; j++) {
                kuadrat = (j*j);
                total += kuadrat;
                System.out.print(kuadrat);

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
        input.close();
    } 
}
