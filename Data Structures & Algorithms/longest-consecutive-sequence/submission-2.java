class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash= new HashSet();
        int res=0;
        for( int x : nums){
            hash.add(x);
        }
        for(int i=0; i<nums.length ; i++){
            int cur= nums[i];
            int count=0;
            if(!hash.contains(cur-1)){
                while(hash.contains(cur)){
                count++;
                cur++;
                }
            }
            res=Math.max(res,count);
        }
        return res;
    }
}
