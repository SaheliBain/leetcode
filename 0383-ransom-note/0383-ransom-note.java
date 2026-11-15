class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        /*int freq[]= new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(freq[ransomNote.charAt(i)-'a']>=1)
                freq[ransomNote.charAt(i)-'a']--;
            else
                return false;
        }
        return true;
        */
        HashMap<Character, Integer> have= new HashMap<>();
        HashMap<Character, Integer> need= new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            need.put(ransomNote.charAt(i),need.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            have.put(magazine.charAt(i),have.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(need.get(ransomNote.charAt(i)) >have.getOrDefault(ransomNote.charAt(i), 0))
                return false;

        }
        return true;
    }
}