import java.util.Scanner;

public class Day10_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks :");
        int marks = sc.nextInt();
        System.out.print("Percentage : ");
        double percentage = sc.nextDouble();
        System.out.print("Grade : ");
        char grade = sc.next().charAt(0);

        double marks1 = marks;
        int percentage1=(int)percentage;
        int grade1=(int)grade;
        System.out.println("Converted Marks : "+marks1);
        System.out.println("Converted Percentage : "+percentage1);
        System.out.println("Converted Grade : "+grade1);

        sc.close();

    }
}
