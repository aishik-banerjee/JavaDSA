package Recursion;
public class Skip {

    public static void main(String[] args) {
        System.out.println(skipWord("", "mynameistestaishik"));  
    }

    public static String skipCharacter(String p, String up){

        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return skipCharacter(p, up.substring(1));
        }else{
            return skipCharacter(p + ch, up.substring(1));
        }
    }

    public static String skipWord(String p, String up){

        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if(up.startsWith("test")){
            return skipWord(p, up.substring(4));
        }else{
            return skipWord(p + ch, up.substring(1));
        }
    }
}
