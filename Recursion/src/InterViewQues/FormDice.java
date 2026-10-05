package InterViewQues;

import java.util.ArrayList;

public class FormDice {
    static void main(String[] args) {
//        formDice("" , 5);
        System.out.println(formDiceRet("" , 4));
        formDiceFace("" , 1, 2);
    }

    static void formDice(String p ,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<= target; i++){
            formDice(p+i,target-i);
        }
    }
    static ArrayList<String> formDiceRet(String p ,int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<= target; i++){
            ans.addAll(formDiceRet(p+i,target-i));
        }
        return ans;
    }
    static void formDiceFace(String p ,int target , int face ){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=face && i<= target; i++){
            formDiceFace(p+i,target-i , face);
        }
    }

}
