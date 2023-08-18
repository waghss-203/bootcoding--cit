import java.util.Scanner;

public class arithmetic2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number:");
        int n = sc.nextInt();
        System.out.println("Enter second number:");
        int m = sc.nextInt();
        int div = n/m;
        System.out.println("Division="+div);
    }
}
