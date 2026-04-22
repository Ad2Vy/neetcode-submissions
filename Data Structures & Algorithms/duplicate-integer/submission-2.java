class Solution {
    public boolean hasDuplicate(int[] nums) {
        return isDuplicate(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }

    public boolean isDuplicate(int[] nums){
        HashSet<Integer> hash= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}
