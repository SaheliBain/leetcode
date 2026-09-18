class Solution {
    public int majorityElement(int[] arr) {
      HashMap<Integer, Integer> mp=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
           mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
       }
       //traverse and check freq>n/2
       for(Map.Entry<Integer,Integer> entry: mp.entrySet())
       {
           if(entry.getValue()>(arr.length/2))
           {
               return entry.getKey();
           }
       }
       return -1; 
    }
}