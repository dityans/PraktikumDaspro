package jobsheet7;

public class tugasC {
    public static void main(String[] args) {
        int bilangan = 1;

        while(bilangan<=50){
            if (bilangan%3!=0) {
                System.out.println(bilangan);
            };
            bilangan++;
        }

        // for (; bilangan <= 50; bilangan++) {
        //     if (bilangan%3==0) {
        //         continue;
        //     };
        //     System.out.println(bilangan);
        // }
    }
}
