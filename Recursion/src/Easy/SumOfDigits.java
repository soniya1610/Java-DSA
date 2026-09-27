package Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(111));
    }
    static int sumOfDigits(int n ){
        if(n == 0) return 0;
//        int rem = n % 10;
//        n /= 10;
        return (n%10) + sumOfDigits(n/10);
    }
}
