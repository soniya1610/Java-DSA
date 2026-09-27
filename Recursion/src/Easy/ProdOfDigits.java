package Easy;

public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(prodOfDigits(109));
    }
    static int prodOfDigits(int n ){
        if(n == 1) return 1;
//        int rem = n % 10;
//        n /= 10;
        return (n%10) * prodOfDigits(n/10);
    }
}
