import java.util.Scanner;

public class Day14_EvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count=0;
        int i=2;
        while (i<=n) {
            System.out.print(i+" ");
            i+=2;
            count++;
        }
        System.out.println("Count : "+count);
        sc.close();
    }
}
