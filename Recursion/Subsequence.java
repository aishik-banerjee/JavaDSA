package Recursion;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        subsequence("", "abc");  
    }

    public static void subsequence(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        subsequence(p,up.substring(1));
        subsequence(p+ch,up.substring(1));
    }

    public static ArrayList<String> subsequenceArraylist(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsequenceArraylist(p,up.substring(1));
        ArrayList<String> right = subsequenceArraylist(p+ch,up.substring(1));

        left.addAll(right);

        return left;
    }
    
}
