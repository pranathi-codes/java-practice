import java.util.Scanner;

public class Day09_NestedIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        if (marks >= 90)
            System.out.println("Distinction");
        else if (marks >= 75)
            System.out.println("First class");
        else if (marks >= 60)
            System.out.println("Second class");
        else
            System.out.println("Fail");
        sc.close();
    }
}