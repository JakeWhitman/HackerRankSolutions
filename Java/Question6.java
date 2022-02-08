import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n, q;
        q = sc.nextInt();
        for (int j = 1; j <= q; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int s = (int)(Math.pow(2, i)) * b;
                a += s;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
