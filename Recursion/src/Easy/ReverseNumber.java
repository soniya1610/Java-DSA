package Easy;

public class ReverseNumber {
    public static void main(String[] args) {
         System.out.println(reverseNum1(123));
    }
    static int sum = 0;
    static int reverseNum1(int n){
        if(n == 0) return sum;
        int rem = n % 10;
        sum = sum*10 + rem;
        return reverseNum1(n/10);
    }
}
