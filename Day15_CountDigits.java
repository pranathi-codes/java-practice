import java.util.Scanner;

public class Day15_CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0)
            count += 1;
        while (n > 0) {
            count += 1;
            n /= 10;
        }
        System.out.println("Count : " + count);
        sc.close();
    }
}
