import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Question. Java Loops I
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
