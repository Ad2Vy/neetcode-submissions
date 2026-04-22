class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> prev= new HashSet<>();
        for(int x: nums){
            prev.add(x);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(!prev.contains(cur-1)){
            int count=0;
            while(prev.contains(cur)){
                count++;
                cur++;
            }
            res= Math.max(res,count);
            }
        }
        return res;
    }
}
