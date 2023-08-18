import java.util.Scanner;

public class arithmetic3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int mul= a*b;
        System.out.println("Multiplication="+mul);
        int mod = a%b;
        System.out.println("Modulus="+mod);
        int sub = a-b;
        System.out.println("subtraction="+sub);

    }

}
