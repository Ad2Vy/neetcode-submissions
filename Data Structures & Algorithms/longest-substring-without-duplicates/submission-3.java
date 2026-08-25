class Solution {
    public int lengthOfLongestSubstring(String s) {
       // the previous concept was for longest consecutive substring. which obviously isn't what the question asked.
       // so to get a substring without repeating chars.
       // we can create a hashset and put elements in it until we find a repeat element.
       // if we find a repeat eleement we start over.
        // Also it uses the concept of sliding window. so we keep track of our window and we can move on to next window. with a variable pointer.
        // [ a,b, b, d, f, c]
        
        int res=0;
        

        for(int i=0; i<s.length(); i++){
        int count=0;
         HashSet<Character> hash= new HashSet();
            int j = i;
            while(j<s.length() && (!hash.contains(s.charAt(j)))){
                hash.add(s.charAt(j));
                count++;
                j++;
            }

            res= Math.max(count, res);
        }
        return res;
    }
}
