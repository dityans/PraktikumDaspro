import java.util.Scanner;

public class tugas2jobsheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        if (n < 3) {
            System.out.println("Nilai n harus >= 3");
            input.close();
            return;
        }
        for (int iouter = 1; iouter <= n; iouter++) {
            if (iouter == 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(n);
                }
            } else if (iouter == n) {
                for (int i = 1; i <= n; i++) {
                System.out.print(n);
                }
            } else {
                for (int i = 1; i <= n; i++) {
                    if (i == 1 || i == n) {
                        System.out.print(n);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}
