package Easy;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(fun(5));
//        System.out.println(sum(5));
        System.out.println(sumOfDigits(109));
    }
    static int fun(int n){
        if(n <= 1) return 1;
        return  n * fun(n-1);
    }
    static int sum(int n){
        if(n <= 1) return 1;
        return n + sum(n-1);
    }
    static int sumOfDigits(int n ){
        if(n <= 1) return 1;
        int rem = n % 10;
        n /= 10;
        return rem+sumOfDigits(n-rem);
    }
}
