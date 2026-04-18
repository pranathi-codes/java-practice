import java.util.*;
public class Day29_Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum += (dig*dig*dig);
            num/=10;
        }
        sc.close();
        if(sum==temp)
            System.out.println(temp+" is a Armstrong number");
        else
            System.out.println(temp+" is not a Armstrong number");
        
    }
}
