package Arrays;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    static void main(String[] args) {
        int[] arr = { 2 , 4 , 6 , 3 , 3,  0 , 69 , 70};
//        ArrayList<Integer>  list = new ArrayList<>();
//        System.out.println(find(arr , 6 , 0));
//        System.out.println(search(arr , 0 , 0));
//        System.out.println(searchLast(arr , 0, arr.length-1)); // searching fron first index
//        findAll(arr , 0 , 0);
//        System.out.println(newlist);
//        System.out.println(findAllIndex(arr , 3,0, list));
        System.out.println(findAllIndex2(arr , 3, 0));
    }
    static int search(int[] arr ,int target, int idx){
        if(idx ==  arr.length) return -1;

        if(arr[idx] == target) {
            return idx; // searching from first index
        }else{
            return search(arr, target, idx+1);
        }
    }
    static int searchLast(int[] arr ,int target, int idx){

        if(idx ==  -1 ) return -1;
        if(arr[idx] == target) {
            return  idx;
        }else{
            return search(arr, target, idx-1);
        }
    }

    static ArrayList<Integer> newlist = new ArrayList<>();

    static void findAll(int[] arr ,int target, int idx){
        if(idx ==  arr.length ) return;
        if(arr[idx] == target)  {
            newlist.add(idx); // searching from first index
        }
        findAll(arr, target, idx+1);
    }
    static boolean find(int[] arr , int target , int idx){
        if(idx == arr.length) return false;
        return arr[idx] == target || find(arr , target, idx+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr , int target , int idx, ArrayList<Integer>list){
        if(idx == arr.length) return list;
        if(arr[idx] == target){
            list.add(idx);
        }
        return  findAllIndex(arr , target, idx+1 , list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr , int target , int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length) return list;

        // this will contain answer for that function call only
        if(arr[idx] == target){
            list.add(idx);
        }
        ArrayList<Integer> result = findAllIndex2(arr , target, idx+1);
        list.addAll(result);
        return list;
    }
}
