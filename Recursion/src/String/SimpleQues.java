package String;

public class SimpleQues {
    static void main(String[] args) {
        System.out.println(skip2( "baccad"));
        System.out.println(skipApple("bcappledeap"));
        System.out.println(skipApp("abcappleappde"));
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
    // skip apple
    static String skipApple( String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else{
            return  str.charAt(0) + skipApple(str.substring(1));
        }
    }
    // skip app not apple
    static String skipApp( String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        }else{
            return  str.charAt(0) + skipApp(str.substring(1));
        }
    }
}
