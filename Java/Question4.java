import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Question. Java Output Formatting
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 1; i <= 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%-15s%03d", s, n);//adding -15 before s will left justify the string by 15 and adding 03 before d will set the width to 3 blank spaces will be filled with zeros;
        }
        System.out.println("================================");
    }
}
