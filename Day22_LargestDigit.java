import java.util.Scanner;

public class Day22_LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int max=0;
        while (n>0) {
            int dig=n%10;
            if(dig>max){
                max=dig;
            }
            n/=10;
        }
        System.out.println("Largest digit: " + max);
        sc.close();
    }
}
