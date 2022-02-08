import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //Question. java Datatypes
        Scanner sc = new Scanner(System.in);
        short st = sc.nextShort();
        for (int i = 1; i <= st; i++) {
            String s = sc.next();
            try {
                long l = Long.parseLong(s);
                System.out.println(l + " can be fitted in:");
                if (l >= -128 && l <= 127) {
                    System.out.println("* byte");
                }
                if (l >= -32768 && l <= 32767) {
                    System.out.println("* short");
                }
                if (l >= -2147483648 && l <= 2147483647) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
