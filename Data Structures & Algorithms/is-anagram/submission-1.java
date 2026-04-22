class Solution {
    
    public boolean isAnagram(String s, String t){
        int[] str= new int[26]; 
        if(s.length()!= t.length())return false;
        for(int i=0; i<s.length(); i++){
            str[s.charAt(i)-'a']++;
            str[t.charAt(i)-'a']--;
        }
        for(int x: str)if(x!=0) return false;
        return true;

    }
}
