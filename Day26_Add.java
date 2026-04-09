import java.util.Scanner;

public class Day26_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int sum = add(a, b);
        System.out.println("Sum : " + sum);
        sc.close();
    }

    static int add(int a, int b) {
        return a+b;
    }
}
