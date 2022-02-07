import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Question. Java If-Else
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 1 && n <= 100) {
            if(n % 2 == 0) {
                if(n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if(n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Weird");
            }
        }
    }
}
