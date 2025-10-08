import java.util.Scanner;

public class ifelsenested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        int max, min;

        System.out.print("Masukan bilangan pertama: ");
        a = sc.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        b = sc.nextInt();
        System.out.print("Masukan bilangan ketiga: ");
        c = sc.nextInt();

        // Maksimum
        if (a>b){
            if (a>c)
            max = a;
            else
            max = c;
        }
        else {
            if  (b>c)
            max = b;
            else
            max = c;
        }
        // Minimimum
        if (a<b){
            if (a<c)
            min = a;
            else
            min = c;
        }
        else {
            if  (b<c)
            min = b;
            else
            min = c;
        }
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum:" + min);

        sc.close();
    }
}