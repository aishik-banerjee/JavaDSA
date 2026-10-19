package Recursion;
public class CountZeros {

    public static void main(String[] args) {
        int number = 12034050;
        System.out.print(countzeros(number));
    }

    public static int countzeros(int num){
        return helper(num,0);
    }

    public static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){
            return helper(num/10, count + 1);
        }else{
            return helper(num/10, count);
        }
    }
    
}
