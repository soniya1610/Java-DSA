package Permutations;

import java.util.ArrayList;

public class StringPermutations {
    public static void main(String[] args) {
//        permutations("","abc");
        System.out.println(permutationsListRet("" ,"ab"));
        System.out.println(permutationsIntegerRet("" , "ab"));
    }

    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            permutations(first + ch + second , up.substring(1));
        }
    }
    static ArrayList<String> permutationsListRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>  ans = new ArrayList<>();

        for(int i=0; i <= p.length(); i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            ans.addAll(permutationsListRet(first + ch + second , up.substring(1)));

        }
        return ans;
    }
    static int permutationsIntegerRet(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            count = count + permutationsIntegerRet(first + ch + second , up.substring(1));
        }
        return count;
    }
}
