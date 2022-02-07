import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Question. Java Stdin and Stdout II
        Scanner sc = new Scanner(System.in);
        //Solution1
        //Using System.out.printf();
        /*int a = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();//wondering why -> Read note on the question page
        String s = sc.nextLine();
        System.out.printf("String: %s\nDouble: %f\nInt: %d", s, d, a);
*/

        //solution2
        //Using System.out.println();
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
