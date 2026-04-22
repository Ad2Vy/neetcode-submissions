class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hash=new HashSet<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length; i++){
            if(hash.contains(target-nums[i])){
                res[1]=i;
                for(int j=i-1;j>=0;j--){
                    if(nums[j]==(target-nums[i])){res[0]=j;}
                }
            }
            hash.add(nums[i]);
        }
        return res;
    }
}
