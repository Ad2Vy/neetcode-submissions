class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* so the concept for this problem is sliding window where we keep track of start and end of the window.
        We keep track of the elements and if they are duplicate in a hashset.
        sample char arr [ a, b, c , b, d, f, e]
        */
        int l=0,r=0;
        int res=0;
        HashSet<Character> hash= new HashSet();

        for( int i=0; i< s.length(); i++){
            while(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(l));
                l++;
            }
            hash.add(s.charAt(i));
            res= Math.max(res, i-l + 1);
            
        }
    return res;
    }
}
