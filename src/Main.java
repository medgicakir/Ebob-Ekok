import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0, n2 = 0, k;
        int ebob = 1, ekok = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int a = inp.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int b = inp.nextInt();

        if (a < b) {
            n1 += a;
            n2 += b;
        }
        if (b < a) {
            n1 = b;
            n2 = a;
        }
        k = n1;
        while (k <= n1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob:"+ebob);
                break;
            }
            k--;
        }
        int i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println("Ekok:"+ekok);
                break;
            }
            i++;
        }
    }

}