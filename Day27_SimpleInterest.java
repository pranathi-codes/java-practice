import java.util.Scanner;

public class Day27_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal : ");
        double p = sc.nextDouble();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();
        System.out.print("Enter the rate : ");
        double r = sc.nextDouble();
        System.out.print("Simple Interest : "+simpleInterest(p, r, t));
        sc.close();
    }
    static double simpleInterest(double p,double r,double t){
        return (p*t*r)/100;
    }
}
