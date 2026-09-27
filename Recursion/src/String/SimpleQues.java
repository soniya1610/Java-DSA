package String;

public class SimpleQues {
    static void main(String[] args) {
        System.out.println(skip2( "baccad"));
    }
    static void skip(String  ans, String str ){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip( ans , str.substring(1));
        }else{
            skip(ans+ch, str.substring(1));
        }
    }
    // return string 
    static String skip2( String str ){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip2(str.substring(1));
        }else{
            return ch + skip2(str.substring(1));
        }
    }
}
