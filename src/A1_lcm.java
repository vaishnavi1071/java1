import java.util.Scanner;
public class A1_lcm {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  l = (a>b?a:b);
        int i;
        for (i =l; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0)
                break;
        }
        System.out.println("Lcm of two numbers :"+i);

    }
}
