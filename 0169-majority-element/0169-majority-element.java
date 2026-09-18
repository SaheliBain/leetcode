class Solution {
    public int majorityElement(int[] arr) {
      int ele=0, cnt=0;
      for(int i = 0;i < arr.length; i++)
      {
            if(cnt==0){
                ele=arr[i];
                cnt=1;
            }
            else if(ele==arr[i])
                cnt++;
            else
                cnt--;
      }
      //Recheck
      int check=0;
      for(int i=0;i<arr.length;i++)
      {
        if(ele==arr[i])
            check++;
      }
      if(check > arr.length / 2)
            return ele;
       return -1;   
    }
}