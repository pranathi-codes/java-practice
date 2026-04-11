public class Day28_PassByValue {
    public static void main(String[] args) {
        int num = 10;
        passbyvalue(num);
        System.out.println("Original value : "+num);

    }

    static void passbyvalue(int num) {  // Java uses Pass By Value - changes inside method do not affect original variable
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num += 5;
        System.out.println(num);
    }
}
