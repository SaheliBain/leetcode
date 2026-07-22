import java.util.*;
class Solution {

    public static int findNumbers(int[] nums) {
        int c=0;
        for(int num : nums)
        {
            if(even(num))
            {
                c++;
            }

        }
        return c;
    }
    public static boolean even(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[4];
        System.out.println(findNumbers(nums));
    }
}