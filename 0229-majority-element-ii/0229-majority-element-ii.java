class Solution {
    public ArrayList<Integer> majorityElement(int[] arr) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
           mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
       }
       //traverse and check freq>n/3
       for(Map.Entry<Integer,Integer> entry: mp.entrySet())
       {
           if(entry.getValue()>(arr.length/3))
           {
                list.add(entry.getKey());
           }
       }
       return list; 
    }
}