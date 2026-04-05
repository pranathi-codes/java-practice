import java.util.Scanner;

public class Day23_CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the digit to count : ");
        int k = sc.nextInt();
        int count = 0;
        if(n == 0 && k == 0)
            count=1;
        while (n > 0) {
            int dig = n % 10;
            if (dig == k) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Appeared " + count + " times.");
        sc.close();
    }
}
