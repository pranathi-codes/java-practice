import java.util.Scanner;
public class Day06_UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.nextLine();

        System.out.print("Enter character : ");
        char ch = input.next().charAt(0);

        System.out.print("Enter Integer : ");
        int num = input.nextInt();
        input.nextLine();

        System.out.print("Enter Double : ");
        double price = input.nextDouble();

        System.out.println("Output:");
        System.out.println("String : "+str);
        System.out.println("Character : "+ch);
        System.out.println("Integer : "+num);
        System.out.println("Double : "+price);
        input.close();
    }
}








