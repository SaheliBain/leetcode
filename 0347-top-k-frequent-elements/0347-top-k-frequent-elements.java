class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // 1. Put all unique keys from the map into a List
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        // 2. Sort the keys based on their values (frequencies) in descending order
        keys.sort((a, b) -> map.get(b) - map.get(a));
        
        // 3. Take exactly the first k keys from the sorted list
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }
        
        return result;
    }
}