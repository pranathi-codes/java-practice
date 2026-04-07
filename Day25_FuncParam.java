import java.util.Scanner;

public class Day25_FuncParam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String name = sc.nextLine();
        greet(name);
        sc.close();

    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
