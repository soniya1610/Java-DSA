package Easy;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom(141));
    }
    static int sum = 0;
    static boolean palindrom(int n){
        return n == reverseNum1(n);
    }

    static int reverseNum1(int n){
        if(n == 0) return sum;
        int rem = n % 10;
        sum = sum*10 + rem;
        return reverseNum1(n/10);
    }
}
