package Demo;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
          //print first 5 numbers
        //print(1);
        printRev(5);
    }
    static void print(int n ){
        if(n == 5){ // base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //Recursive call
        // if you are calling a function again and again , you can treat it as a separate call in the stack
        print(n +1);
    }
    static void printRev(int n){
        if(n < 1) return;
        System.out.println(n); //--> 5 , 4, 3, 2 , 1
        printRev(n -1);
        System.out.println(n); // 1 , 2 , 3 , 4 , 5
    }
}
