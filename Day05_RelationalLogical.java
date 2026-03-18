public class Day05_RelationalLogical {

    public static void main(String[] args) {
        
        int a = 7;
        int b = 4;
       //Relational Operators
        System.out.println("a > b : "+(a>b));
        System.out.println("a < b: "+(a<b));
        System.out.println("a == b : "+(a==b));

        //Logical Operators
        System.out.println("Are both numbers positive? "+(a>0 && b>0));
        System.out.println("Is at least one number even? "+(a%2==0 || b%2==0));
        System.out.println("Is the number NOT positive? "+(!(a>0)));
    }
}








