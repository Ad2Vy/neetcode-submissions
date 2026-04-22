class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> prev= new HashSet<>();
        for(int x: nums){
            prev.add(x);
        }
        for(int i=0;i<nums.length;i++){
            int count=0, cur=nums[i];
            while(prev.contains(cur)){
                count++;
                cur++;
            }
            res= Math.max(res,count);
        }
        return res;
    }
}
